<%-- 
    Document   : modificaTag
    Created on : 25-mar-2019, 11.11.31
    Author     : tss
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!--<link href="cssNostalciac.css" rel="stylesheet" type="text/css"/>-->
        <link rel="shortcut icon" href="">
        <%--<link href="css/forms.css" rel="stylesheet" type="text/css"/>--%>
        <link href="css/cssNostalciac.css" rel="stylesheet" type="text/css"/>
        <script src="libreria.js" type="text/javascript"></script>
        <title>modifica SEDI</title>
    </head>
    <body>
        <h1>Modifica SEDI</h1>
        <div id="contenitore"></div>
        <br>
        <div class="navigazione" id="navigazione">
            <button class="p_navig" id="primo">&Ll;</button>
            <button class="p_navig" id="prec">&DoubleLongLeftArrow;</button>
            <button class="p_navig" id="succ">&DoubleLongRightArrow;</button>
            <button class="p_navig" id="ultimo">&Gg;</button>
        </div>
        <br>
        <div>
            <input type="button" id="b_insSede" value="Inserisci una nuova sede">
            <select id="sel_sedi">
                <option value="-1">Scegli la Sede</option>
            </select>            
        </div>
        <br>
        <br>
        <form class="corpo">
            <label for="nome">Nome sede: </label>
            <input type="text" id="nome" class="pure-input-1"><br/>
            <br>

            <label for="indirizzo">Indirizzo: </label>
            <input type="text" id="indirizzo" class="pure-input-1"><br/>
            <br>

            <label for="tel">Tel: </label>
            <input type="text" id="tel" class="pure-input-1" ><br/>
            <br>

            <label for="citta">Città: </label>
            <input type="text" id="citta" size="100"><br/>
            <br>

            <label for="mail">Mail: </label>
            <input type="text" id="mail" size="100"><br/>
            <br>

            <label for="note">Note: </label>
            <input type="text" id="note" size="1000"><br/>
            <br>

            <input type="hidden" id="id_rec">

            <input type="button" id="b_modSede" value="Conferma modifica">
            <br>

        </form>
        <script src="modificaSede.js" type="text/javascript"></script>
    </body>
</html>