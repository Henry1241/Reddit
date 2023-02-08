/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reditt;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import mx.itson.reditt.entidades.Comentario;
import mx.itson.reditt.entidades.Comunidad;
import mx.itson.reditt.entidades.Post;
import mx.itson.reditt.entidades.Usuario;

/**
 *
 * @author enri0
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Usuario u = new Usuario();
        u.setNombre("MichaelJay");
        u.setCorreo("mike.correo@gmail.com");
        u.setPassword("BasketMike");
        u.setPais("Estados Unidos");

        List<Comentario> comentarios = new ArrayList<>();
        Comentario c1 = new Comentario();
        c1.setUsuario("JohnyK");
        c1.setCuerpo("Nice to share this with y’all");
        c1.setPuntos(1);
        c1.setFecha(Date.from(Instant.MIN));
        
        Comentario c2 = new Comentario();
        c2.setUsuario("BounceLord");
        c2.setCuerpo("Too many TO's also like, wtf is wrong with your hands? "
                + "How do you not handle the ball if you have big hands it is "
                + "so frustrating to watch.");
        c2.setPuntos(10);
        c2.setFecha(Date.from(Instant.MAX));
        
        Comentario c3 = new Comentario();
        c3.setUsuario("BasketMan");
        c3.setCuerpo("He does tend to disappear. His worst feature by far.");
        c3.setPuntos(5);
        c3.setFecha(Date.from(Instant.MAX));

        Comentario c4 = new Comentario();
        c4.setUsuario("RingMaster");
        c4.setCuerpo("Would you rather have Davis or the Suns' Deandre Ayton?");
        c4.setPuntos(1);
        c4.setFecha(Date.from(Instant.MAX));
        
        List<Comentario> comentarios2 = new ArrayList<>();
        Comentario c5 = new Comentario();
        c1.setUsuario("Los Angeles1s");
        c1.setCuerpo("I cant really see Kyrie staying after this year with "
                + "Dallas tbh");
        c1.setPuntos(16);
        c1.setFecha(Date.from(Instant.MAX));
        
        Comentario c6 = new Comentario();
        c2.setUsuario("jetsStreeg");
        c2.setCuerpo("If they give him the money he wants he will");
        c2.setPuntos(15);
        c2.setFecha(Date.from(Instant.MAX));
        
        Comentario c7 = new Comentario();
        c3.setUsuario("Sillysolomon");
        c3.setCuerpo("I can't see staying past 3 weeks.");
        c3.setPuntos(50);
        c3.setFecha(Date.from(Instant.MAX));

        Comentario c8 = new Comentario();
        c4.setUsuario("1LeakShow7");
        c4.setCuerpo("Now we can stop it with the bs rumors. Every year man "
                + "same bs during trade deadline.");
        c4.setPuntos(68);
        c4.setFecha(Date.from(Instant.MAX));
        
        List<Comentario> comentarios3 = new ArrayList<>();
        Comentario c9 = new Comentario();
        c9.setUsuario("This-May-Be-It");
        c9.setCuerpo("Perfect summary of my thoughts lol.");
        c9.setPuntos(158);
        c9.setFecha(Date.from(Instant.MAX));
        
        Comentario c10 = new Comentario();
        c10.setUsuario("presidentArea");
        c10.setCuerpo("This loss really hurt. Golden opportunity to make some "
                + "ground in the standings, especially with Zion out.");
        c10.setPuntos(150);
        c10.setFecha(Date.from(Instant.MAX));
        
        Comentario c11 = new Comentario();
        c11.setUsuario("AlveinFencer");
        c11.setCuerpo("Sounds about right.");
        c11.setPuntos(510);
        c11.setFecha(Date.from(Instant.MAX));

        Comentario c12 = new Comentario();
        c12.setUsuario("guiltyTechnician");
        c12.setCuerpo("you were probably gunning for Kyrie to come here");
        c12.setPuntos(343);
        c12.setFecha(Date.from(Instant.MAX));
        
        Comunidad c = new Comunidad();
        c.setNombre("r/lakers");
        c.setUsuarios((List<Usuario>) u);

        List<Post> posts = new ArrayList<>();

        Post post1 = new Post();
        post1.setTitulo("[2/7 @ 7:00] Los Angeles Lakers (25-29) vs Oklahoma "
                + "City Thunder (25-28)");
        post1.setContenido("The bot didn't make a thread oops.");
        post1.setFecha(Date.from(Instant.MIN));
        post1.setPuntos(156);
        post1.setComentarios(comentarios);
        post1.setUsuario(u);
        post1.setComunidad(c);

        Post post2 = new Post();
        post2.setTitulo("BREAKING: The Brooklyn Nets are trading Kyrie Irving"
                + "to the Dallas Mavericks for Spencer Dinwiddie, Dorian"
                + "Finney-Smith, a first-round and multiple second-round picks,"
                + "sources tell @TheAthletic @Stadium.");
        post2.setContenido("El tweet de la noticia en cuestion");
        post2.setFecha(Date.from(Instant.MIN));
        post2.setPuntos(2000);
        post2.setComentarios(comentarios2);
        post2.setUsuario(u);
        post2.setComunidad(c);

        Post post3 = new Post();
        post3.setTitulo("Anyone else happy we didn’t trade for Kyrie?");
        post3.setContenido("Like I don’t think our team right now is great but "
                + "Kyrie has been a huge distraction to every organization he’s "
                + "been in. I feel like we are gonna be better off with other "
                + "pieces besides him.");
        post3.setFecha(Date.from(Instant.MIN));
        post3.setPuntos(995);
        post3.setComentarios(comentarios3);
        post3.setUsuario(u);
        post3.setComunidad(c);
        
        u.setKarma(post1.getPuntos() + post2.getPuntos() + post3.getPuntos());
    }
}
