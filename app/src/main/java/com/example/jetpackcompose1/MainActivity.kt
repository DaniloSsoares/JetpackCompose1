package com.example.jetpackcompose1


import android.os.Bundle
import android.widget.Space

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column


import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button

import androidx.compose.material3.Surface
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose1.ui.theme.JetpackCompose1Theme

class MainActivity : ComponentActivity() {
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
        JetpackCompose1Theme{
//O Surface é um componente do Jetpack Compose que define uma superfície na qual você pode
// colocar outros componentes para exibição. Ele é usado para aplicar atributos visuais,
// como cor de fundo e sombreamento, a uma região específica da interface do usuário.
            Surface(modifier = Modifier.fillMaxSize(),
                color = Color.Black
            ) {
                Scrolling()
            }
        }
    }
  }
}
@Preview
@Composable
//possui um valor padrão de Modifier.
// Isso permite que você passe um modificador personalizado para a função Scrolling,
// mas se nenhum modificador for fornecido, o valor padrão será usado.

fun Scrolling(modifier: Modifier = Modifier) {
    val showImagess = remember{mutableStateOf(false)}
    val showImages = remember { mutableStateOf(false)}
    //organiza os elementos verticalmente.
    // Neste caso, estamos usando uma coluna principal como o contêiner principal.

    Column(
        modifier

            //pega-se a cor total ou seja o backround preto
            .fillMaxSize()
            //Aplica um modificador de rolagem vertical na coluna. O rememberScrollState()
            // é usado para lembrar o estado de rolagem e aplicá-lo à coluna.
            .verticalScroll(rememberScrollState())

            .background(Color.Black)
    ) {
        //É uma coluna aninhada dentro da coluna principal.
        // Essa coluna é usada para agrupar os elementos que serão posicionados na tela.
        Column {
            Row(modifier = Modifier.padding(all = 10.dp)) {

                Image(
                    painter = painterResource(R.drawable.transformers),
                    contentDescription = "Contact profile picture",
                    modifier = Modifier
                        .height(300.dp)
                        .width(500.dp)
                        .background(Color.Black)
                )
            }

        }
        Column(modifier = Modifier.padding(all = 8.dp)) {
            Button(
                onClick = { showImages.value = !showImages.value },
                modifier = Modifier.background(color = Color.Transparent)
            ) {
                Image(
                    painter = painterResource(R.drawable.autobots),
                    contentDescription = "Contact profile picture",
                    modifier = Modifier.size(70.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "Autobots",
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp,
                    color = Color.White,
                    modifier = Modifier.padding(10.dp)
                )
                Spacer(modifier = Modifier.height(4.dp))
            }
        }

        if (showImages.value) {
            Column(modifier = Modifier.padding(all = 8.dp)) {
                Image(
                    painter = painterResource(R.drawable.optimus1),
                    contentDescription = "Imagem 1",
                    modifier = Modifier
                        .height(300.dp)
                        .width(500.dp)
                        .size(100.dp)
                        .padding(bottom = 8.dp)
                )
                Text(
                    text = "Optimus Prime é o líder icônico dos Autobots, conhecido por sua sabedoria, coragem e liderança inabalável." +
                            " Ele é o símbolo da justiça e da proteção, e sua história é repleta de heroísmo e sacrifício." +
                            "Optimus Prime é retratado como um Autobot nobre e compassivo, que coloca o bem-estar dos outros acima de si mesmo." +
                            " Ele é conhecido por sua ética moral e seu compromisso em defender a liberdade e a paz. Sua voz poderosa e presença" +
                            " imponente inspiram confiança em seus aliados e incutem medo em seus inimigos.Optimus Prime é o último descendente da " +
                            "Dinastia dos Primes e sucessor de Sentinel Prime. Em Cybertron, ele era apenas um operário da equipe de Sentinel Prime até " +
                            "descobrir suas origens e se tornar o líder dos Autobots.",
                    fontWeight = FontWeight.Bold,
                    fontSize = 10.sp,
                    color = Color.White,
                    modifier = Modifier.padding(10.dp)
                )
                Image(
                    painter = painterResource(R.drawable.arcee),
                    contentDescription = "Imagem 1",
                    modifier = Modifier
                        .height(300.dp)
                        .width(500.dp)
                        .size(100.dp)
                        .padding(bottom = 8.dp)
                )
                Text(
                    text = "Arcee é uma Autobot corajosa e habilidosa, conhecida por sua aparência elegante e personalidade forte." +
                            " Ela é a única Autobot feminina em muitas versões da franquia Transformers. Arcee é uma guerreira experiente" +
                            " e especialista em combate corpo a corpo, capaz de se transformar em uma motocicleta ou outros veículos de duas rodas. ",
                    fontWeight = FontWeight.Bold,
                    fontSize = 10.sp,
                    color = Color.White,
                    modifier = Modifier.padding(10.dp)
                )
                Image(
                    painter = painterResource(R.drawable.cliffe),
                    contentDescription = "Imagem 2",
                    modifier = Modifier
                        .height(300.dp)
                        .width(500.dp)
                        .size(100.dp)
                        .padding(bottom = 8.dp)
                )
                Text(
                    text = "Cliffjumper é um Autobot valente e destemido, conhecido por sua aparência robusta e sua cor vermelha vibrante. " +
                            "Ele é retratado como um guerreiro ágil e habilidoso, com uma personalidade impetuosa e muita coragem." +
                            "Ele tem uma tendência a agir impulsivamente, lançando-se no calor da batalha sem considerar totalmente as consequências. ",
                    fontWeight = FontWeight.Bold,
                    fontSize = 10.sp,
                    color = Color.White,
                    modifier = Modifier.padding(10.dp)
                )
                Image(
                    painter = painterResource(R.drawable.bumblebee),
                    contentDescription = "Imagem 3",
                    modifier = Modifier
                        .height(300.dp)
                        .width(500.dp)
                        .size(100.dp)
                        .padding(bottom = 8.dp)
                )
                Text(
                    text = "Bumblebee é um Autobot, um robô alienígena que se transforma em um carro amarelo compacto." +
                            " Ele veio do planeta Cybertron para a Terra junto com outros Autobots," +
                            " na luta contra os malévolos Decepticons. Bumblebee se destaca por sua lealdade, coragem e personalidade enérgica.",
                    fontWeight = FontWeight.Bold,
                    fontSize = 10.sp,
                    color = Color.White,
                    modifier = Modifier.padding(10.dp))
                Image(
                    painter = painterResource(R.drawable.whel),
                    contentDescription = "Imagem 4",
                    modifier = Modifier
                        .height(300.dp)
                        .width(500.dp)
                        .size(100.dp)
                        .padding(bottom = 8.dp)
                )
                Text(
                    text = "Wheeljack é um Autobot inventor e engenheiro, conhecido por sua genialidade e habilidades técnicas." +
                            "sempre desenvolvendo novas tecnologias e dispositivos para ajudar os Autobots em suas batalhas contra os Decepticons." +
                            "Com uma personalidade excêntrica e uma mente brilhante, Wheeljack é um dos Autobots mais talentosos quando se trata de engenharia e" +
                            " desenvolvimento de armas. Ele é frequentemente retratado como um gênio científico que adora experimentar e criar novas invenções.",
                    fontWeight = FontWeight.Bold,
                    fontSize = 10.sp,
                    color = Color.White,
                    modifier = Modifier.padding(10.dp))
            }
        }

        Column(modifier = Modifier.padding(all = 8.dp)) {
            Button(
                onClick = { showImagess.value = !showImagess.value },
                modifier = Modifier.background(color = Color.Transparent)
            ) {
                Image(
                    painter = painterResource(R.drawable.decepticom),
                    contentDescription = "Contact profile picture",
                    modifier = Modifier.size(60.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "Decepticon",
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp,
                    color = Color.White,
                    modifier = Modifier.padding(10.dp)
                )
                Spacer(modifier = Modifier.height(4.dp))
            }}
                if (showImagess.value) {
                    Column(modifier = Modifier.padding(all = 8.dp)) {
                        Image(
                            painter = painterResource(R.drawable.mega),
                            contentDescription = "Imagem 3",
                            modifier = Modifier
                                .height(300.dp)
                                .width(500.dp)
                                .size(100.dp)
                                .padding(bottom = 8.dp)
                        )

                        Text(
                            text = "Megatron é o principal antagonista da franquia Transformers, líder implacável dos Decepticons e arqui-inimigo de Optimus " +
                                    "Prime e dos Autobots. Ele é conhecido por sua ambição desmedida, crueldade e determinação em conquistar o poder absoluto.\n" +
                                    "\n" +
                                    "Megatron é retratado como um guerreiro formidável e estrategista astuto. Ele se transforma em várias formas, " +
                                    "geralmente assumindo a forma de um jato de combate ou um tanque, o que lhe confere força e poder de fogo avassaladores." +
                                    " Sua busca pela supremacia e controle o leva a liderar os Decepticons em uma guerra contra os Autobots e a ameaçar a" +
                                    " paz em vários mundos.",
                            fontWeight = FontWeight.Bold,
                            fontSize = 10.sp,
                            color = Color.White,
                            modifier = Modifier.padding(10.dp)
                        )

                        Image(
                            painter = painterResource(R.drawable.star),
                            contentDescription = "Imagem 3",
                            modifier = Modifier
                                .height(300.dp)
                                .width(500.dp)
                                .size(100.dp)
                                .padding(bottom = 8.dp)
                        )

                        Text(
                            text = "Starscream é um personagem notável da franquia Transformers, conhecido como o segundo-em-comando dos Decepticons e " +
                                    "um dos traidores mais infames do grupo. Ele é retratado como um robô traiçoeiro e ambicioso, sempre em busca de poder e" +
                                    " do posto de líder dos Decepticons.\n" +
                                    "\n" +
                                    "Starscream é frequentemente mostrado como um piloto habilidoso e astuto, capaz de se transformar em uma aeronave " +
                                    "de combate, como um caça a jato. Ele é conhecido por sua agilidade e velocidade, o que o torna um adversário formidável " +
                                    "em batalha.",
                            fontWeight = FontWeight.Bold,
                            fontSize = 10.sp,
                            color = Color.White,
                            modifier = Modifier.padding(10.dp)
                        )

                        Image(
                            painter = painterResource(R.drawable.shock),
                            contentDescription = "Imagem 3",
                            modifier = Modifier
                                .height(300.dp)
                                .width(500.dp)
                                .size(100.dp)
                                .padding(bottom = 8.dp)
                        )

                        Text(
                            text = "Soundwave é um personagem icônico da franquia Transformers, conhecido como um dos leais seguidores de Megatron " +
                                    "e um especialista em comunicações e espionagem. Ele é retratado como um robô silencioso, mas extremamente leal " +
                                    "e perigoso.\n" +
                                    "\n" +
                                    "Soundwave tem a habilidade única de se transformar em um aparelho de som ou um sistema de comunicação avançado," +
                                    " o que lhe permite interceptar e decodificar transmissões de rádio, além de transmitir suas próprias mensagens." +
                                    " Ele é frequentemente acompanhado por uma equipe de mini-cassetes, conhecidos como \"Casseticons\" ou \"Mini-Cons\"," +
                                    " que podem se transformar em várias formas e ajudam Soundwave em suas tarefas de espionagem e combate.",
                            fontWeight = FontWeight.Bold,
                            fontSize = 10.sp,
                            color = Color.White,
                            modifier = Modifier.padding(10.dp)
                        )

                        Image(
                            painter = painterResource(R.drawable.shockwave),
                            contentDescription = "Imagem 3",
                            modifier = Modifier
                                .height(300.dp)
                                .width(500.dp)
                                .size(100.dp)
                                .padding(bottom = 8.dp)
                        )

                        Text(
                            text = "Shockwave é um personagem importante da franquia Transformers, conhecido por sua inteligência superior e natureza impiedosa." +
                                    " Ele é frequentemente retratado como um dos cientistas e estrategistas mais brilhantes dos Decepticons.\n" +
                                    "\n" +
                                    "Shockwave é reconhecido por sua aparência distinta, com um único olho vermelho brilhante no lugar de seus dois olhos." +
                                    " Ele é conhecido por sua frieza e lógica implacável, sempre priorizando a eficiência e o sucesso dos Decepticons acima" +
                                    " de tudo.\n" +
                                    "\n" +
                                    "Como cientista, Shockwave é especializado em pesquisas e desenvolvimento tecnológico avançado. Ele é conhecido por criar" +
                                    " armas devastadoras e tecnologias inovadoras para os Decepticons, contribuindo significativamente para seu poderio militar" +
                                    " e estratégico.",
                            fontWeight = FontWeight.Bold,
                            fontSize = 10.sp,
                            color = Color.White,
                            modifier = Modifier.padding(10.dp)
                        )
                    }


                }
        Image(
            painter = painterResource(R.drawable.transformers1),
            contentDescription = "Imagem 3",
            modifier = Modifier
                .height(300.dp)
                .width(500.dp)
                .size(100.dp)
                .padding(bottom = 8.dp)
        )
        Text(
            text = "A história dos Transformers é uma narrativa épica que abrange várias gerações, mídias e continuidades. " +
                    "A premissa básica envolve duas facções de robôs alienígenas em guerra: os Autobots, liderados por Optimus Prime," +
                    " e os Decepticons, liderados por Megatron.\n" +
                    "\n" +
                    "Os Transformers são uma espécie de robôs que possuem a habilidade de se transformar em diferentes formas," +
                    " geralmente veículos, armas ou dispositivos eletrônicos. Eles vêm do planeta Cybertron e, originalmente," +
                    " viviam em harmonia. No entanto, uma disputa entre os líderes Optimus Prime e Megatron pela posse do AllSpark," +
                    " uma fonte de energia vital, levou à divisão da sociedade e à guerra civil.\n" +
                    "\n" +
                    "Os Autobots são os defensores da liberdade e da justiça, buscando proteger a vida orgânica e preservar a paz." +
                    " Eles são liderados por Optimus Prime, um líder nobre e corajoso, conhecido por sua sabedoria e devoção a seus" +
                    " companheiros Autobots.\n" +
                    "\n" +
                    "Os Decepticons, por outro lado, são movidos pela ambição e desejam conquistar Cybertron e outros mundos." +
                    " Sob o comando de Megatron, um líder implacável e astuto, eles buscam poder e dominação, não hesitando em usar a " +
                    "violência e a destruição para alcançar seus objetivos.\n" +
                    "\n" +
                    "A guerra entre Autobots e Decepticons se estende por vários planetas, incluindo a Terra, onde os Transformers" +
                    " encontram refúgio e enfrentam uma nova gama de desafios. Eles interagem com os seres humanos, formam alianças" +
                    " improváveis \u200B\u200Be travam batalhas épicas para proteger o planeta e o universo contra ameaças diversas," +
                    " incluindo outros Transformers malévolos, como Unicron, um ser cósmico destrutivo.\n" +
                    "\n" +
                    "A história dos Transformers é contada através de várias séries animadas, filmes, quadrinhos e outros meios de " +
                    "comunicação, cada um oferecendo sua própria interpretação e continuidade. Além dos personagens principais, " +
                    "como Optimus Prime, Megatron, Bumblebee e Starscream, há uma ampla variedade de Autobots e Decepticons, " +
                    "cada um com suas próprias características e personalidades distintas.\n" +
                    "\n" +
                    "Ao longo dos anos, a história dos Transformers tem sido marcada por conflitos épicos, momentos de heroísmo, " +
                    "sacrifício e redenção. Ela explora temas de lealdade, amizade, moralidade, identidade e a natureza da guerra. " +
                    "Os Transformers se tornaram ícones da cultura pop, conquistando uma base de fãs dedicada em todo o mundo.",
            fontWeight = FontWeight.Bold,
            fontSize = 10.sp,
            color = Color.White,
            modifier = Modifier.padding(10.dp)
        )}}





