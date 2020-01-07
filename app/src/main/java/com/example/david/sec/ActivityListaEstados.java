package com.example.david.sec;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ActivityListaEstados extends AppCompatActivity {

    private RecyclerView recyclerViewEstados;
    private RecyclerViewAdapter adaptadorEstados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_estados);

        //Poner icono en action Bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        recyclerViewEstados = (RecyclerView) findViewById(R.id.RecyclerView);
        recyclerViewEstados.setLayoutManager(new LinearLayoutManager(this));

        adaptadorEstados = new RecyclerViewAdapter(obtenerEstados());
        recyclerViewEstados.setAdapter(adaptadorEstados);
    }

    public List<Estados> obtenerEstados(){
        List<Estados> registros = new ArrayList<>();
        registros.add(new Estados("Aguascalientes","Aguascalientes","https://www.lanetanoticias.com/wp-content/uploads/2017/12/202121-Plaza-En-Aguascalientes.jpg"));
        registros.add(new Estados("Baja California","Mexícali","http://sintesistv.com.mx/wp-content/uploads/2018/03/mexicali-letras-monumentales.jpg"));
        registros.add(new Estados("Baja California Sur","La Paz","https://i2.wp.com/www.bcsnoticias.mx/wp-content/uploads/2016/10/letras-la-paz-malec%C3%B3n.jpg?fit=990%2C660&ssl=1"));
        registros.add(new Estados("Campeche","Campeche","https://www.visitmexico.com/viajemospormexico/assets/uploads/estados/5406_Campeche_Regiones_Estados_Centro%20Campeche.jpg"));
        registros.add(new Estados("Coahuila","Saltillo","https://imagenes.milenio.com/Q62_kdnuv9Puko1X387zk1-ifb0=/958x596/https://www.milenio.com/uploads/media/2018/07/29/region-laguna-lugares-visitados-saul.jpg"));
        registros.add(new Estados("Colima","Colima","https://afmedios-afmedios.netdna-ssl.com/inc/uploads/2018/12/letrero-colima-centro-2.jpg"));
        registros.add(new Estados("Chiapas","Tuxtla Gutiérrez","https://s3-us-west-2.amazonaws.com/mundojoven.dev/wp-content/uploads/2017/04/19163236/Chiapas_750x340px_23.jpg"));
        registros.add(new Estados("Chiuhuahua","Chiuhuahua","http://www.chihuahuamexico.com.mx/wp-content/uploads/2017/04/patrimonio-cultural-de-chihuahua.jpg"));
        registros.add(new Estados("Ciudad de México","CDMX","https://content.r9cdn.net/rimg/dimg/9b/2d/0aeefb46-city-53588-162aa932673.jpg?crop=true&width=1440&height=900&xhint=1388&yhint=923"));
        registros.add(new Estados("Durango","Durango","https://www.elsiglodetorreon.com.mx/m/i/2007/06/13728.jpeg"));
        registros.add(new Estados("Guanajuato","Guanajuato","https://www.elfinanciero.com.mx/uploads/2018/08/22/761b42cfff1534969676_standard_desktop_medium_retina.jpeg"));
        registros.add(new Estados("Guerrero","Chilpancingo","http://pablohiriart.com/wp-content/uploads/2015/08/acapulco-internas-750x350.png"));
        registros.add(new Estados("Hidalgo","Pachuca","https://info7rm.blob.core.windows.net.optimalcdn.com/images/2016/11/09/494303_turismo-tula-hidalgo.jpg"));
        registros.add(new Estados("Jalisco","Guadalajara","https://secturjal.jalisco.gob.mx/sites/secturjal.jalisco.gob.mx/files/guadalajara.png"));
        registros.add(new Estados("Estado de México","Toluca","https://upload.wikimedia.org/wikipedia/commons/3/37/Catedral_Toluca.jpg"));
        registros.add(new Estados("Michoacán","Morelia","http://michoacan.travel/assets/cache/546c7db00a7ea7f4ee164855c22b1efe/locality-8906-destinos-morelia_849x477_adaptiveResize.jpg"));
        registros.add(new Estados("Morelos","Cuernavaca","https://morelosturistico.com/portal/cont_imgs/desp/7_Lugares_de_Morelos_que_deberias_visitar.jpg"));
        registros.add(new Estados("Nayarit","Tepic","https://www.altonivel.com.mx/wp-content/uploads/2017/05/riviera-nayarit.jpg"));
        registros.add(new Estados("Nuevo León","Monterrey","https://imagenes.milenio.com/xWP9lKmy2TohOJFevfTn5eSFn2M=/958x596/https://www.milenio.com/uploads/media/2019/08/08/el-cerro-de-la-silla.jpg"));
        registros.add(new Estados("Oaxaca","Oaxaca","https://psn.si/wp-content/uploads/2018/12/La-ciudad-de-Oaxaca-encabeza-la-lista-de-destinos-culturales-para-2019.jpg"));
        registros.add(new Estados("Puebla","Puebla","https://www.visitmexico.com/viajemospormexico/assets/uploads/destinos/puebla_destinos-principales_cholula_01.jpg"));
        registros.add(new Estados("Querétaro","Querétaro","https://www.mexicodesconocido.com.mx/wp-content/uploads/2015/11/cosas-que-hacer-en-queretaro-02.jpg"));
        registros.add(new Estados("Quintana Roo","Chetumal","https://viamexico.mx/wp-content/uploads/2018/01/zonas-arqueologicas-en-Quintana-Roo-1920x1200.png"));
        registros.add(new Estados("San Luis Potosí","San Luis Potosí","https://imagenescityexpress.scdn6.secure.raxcdn.com/sites/default/files/hoteles-en-san-luis-potosi-belleza-ruta-virreinal.jpg"));
        registros.add(new Estados("Sinaloa","Culiacán","https://www.nitu.mx/wp-content/uploads/2019/05/Turismo-Sinaloa.jpg"));
        registros.add(new Estados("Sonora","Hermosillo","https://elsouvenir.com/wp-content/uploads/2017/02/Hermosillo-Sonora.jpg"));
        registros.add(new Estados("Tabasco","Villahermosa","https://upload.wikimedia.org/wikipedia/commons/thumb/d/d5/Olmeca_head_in_Villahermosa.jpg/270px-Olmeca_head_in_Villahermosa.jpg"));
        registros.add(new Estados("Tamaulipas","Ciudad Victoria","http://noticias24siete.com/wp-content/uploads/2017/01/WhatsApp-Image-2017-01-10-at-10.25.03-AM-1200x720.jpeg"));
        registros.add(new Estados("Tlaxcala","Tlaxcala","https://www.dondeir.com/wp-content/uploads/2019/07/lugares-para-visitar-en-tlaxcala-iglesia-tlaxco.jpg"));
        registros.add(new Estados("Veracruz","Xalapa","https://rotativo.com.mx/assets//2018/03/veracruz-con-oferta-de-turismo-religioso-y-cultural-en-semana-santa-696x464.jpg"));
        registros.add(new Estados("Yucatán","Mérida","https://blog.expedia.mx/wp-content/uploads/Lugares-Para-Visitar-en-Yucatan.jpg"));
        registros.add(new Estados("Zacatecas","Zacatecas","https://www.mexicodesconocido.com.mx/wp-content/uploads/2019/03/Catedral_de_Zacatecas_M%C3%A9xico..jpg"));
        return registros;
    }
}
