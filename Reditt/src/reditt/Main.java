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
        
        Usuario u2 = new Usuario();
        u2.setNombre("JohnyK");
        u2.setCorreo("jonny.correo@gmail.com");
        u2.setPassword("JhonsonKeyson");
        u2.setPais("Estados Unidos");
        
        Usuario u3 = new Usuario();
        u3.setNombre("BounceLord");
        u3.setCorreo("bryan.correo@gmail.com");
        u3.setPassword("bryantastic");
        u3.setPais("Estados Unidos");
        
        Usuario u4 = new Usuario();
        u4.setNombre("BasketMan");
        u4.setCorreo("bron.correo@gmail.com");
        u4.setPassword("LeJohn");
        u4.setPais("Estados Unidos");
        
        Usuario u5 = new Usuario();
        u5.setNombre("RingMaster");
        u5.setCorreo("ring.correo@gmail.com");
        u5.setPassword("ringStyle");
        u5.setPais("Estados Unidos");
        
        Usuario u6 = new Usuario();
        u6.setNombre("Los Angelesls");
        u6.setCorreo("angel.correo@gmail.com");
        u6.setPassword("LAgame");
        u6.setPais("Mexico");
        
        Usuario u7 = new Usuario();
        u7.setNombre("jetsSteeg");
        u7.setCorreo("jay.correo@gmail.com");
        u7.setPassword("combatJet");
        u7.setPais("Canada");
        
        Usuario u8 = new Usuario();
        u8.setNombre("Sillysolomon");
        u8.setCorreo("solomon.correo@gmail.com");
        u8.setPassword("SolomonWisdom");
        u8.setPais("England");
        
        Usuario u9 = new Usuario();
        u9.setNombre("1LeakShow7");
        u9.setCorreo("just.correo@gmail.com");
        u9.setPassword("justinBarley");
        u9.setPais("Estados Unidos");
        
        Usuario u10 = new Usuario();
        u10.setNombre("This-May-Be-It");
        u10.setCorreo("maurice.correo@gmail.com");
        u10.setPassword("So-Let-It-Be");
        u10.setPais("España");
        
        Usuario u11 = new Usuario();
        u11.setNombre("presidentArea");
        u11.setCorreo("kenny.correo@gmail.com");
        u11.setPassword("restictedAccess");
        u11.setPais("Estados Unidos");
        
        Usuario u12 = new Usuario();
        u12.setNombre("AlveiFencer");
        u12.setCorreo("fence.correo@gmail.com");
        u12.setPassword("fenceLooks");
        u12.setPais("Estados Unidos");
        
        Usuario u13 = new Usuario();
        u13.setNombre("guiltyTechnician");
        u13.setCorreo("carlo.correo@gmail.com");
        u13.setPassword("binary000110011");
        u13.setPais("Mexico");

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
        c5.setUsuario("Los Angeles1s");
        c5.setCuerpo("I cant really see Kyrie staying after this year with "
                + "Dallas tbh");
        c5.setPuntos(16);
        c5.setFecha(Date.from(Instant.MAX));
        
        Comentario c6 = new Comentario();
        c6.setUsuario("jetsStreeg");
        c6.setCuerpo("If they give him the money he wants he will");
        c6.setPuntos(15);
        c6.setFecha(Date.from(Instant.MAX));
        
        Comentario c7 = new Comentario();
        c7.setUsuario("Sillysolomon");
        c7.setCuerpo("I can't see staying past 3 weeks.");
        c7.setPuntos(50);
        c7.setFecha(Date.from(Instant.MAX));

        Comentario c8 = new Comentario();
        c8.setUsuario("1LeakShow7");
        c8.setCuerpo("Now we can stop it with the bs rumors. Every year man "
                + "same bs during trade deadline.");
        c8.setPuntos(68);
        c8.setFecha(Date.from(Instant.MAX));
        
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
