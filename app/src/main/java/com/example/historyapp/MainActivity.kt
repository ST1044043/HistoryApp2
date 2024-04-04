package com.example.historyapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebHistoryItem
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        val clear_text = findViewById<Button>(R.id.clear_text)
        val button2 = findViewById<Button>(R.id.start)
        val editTextText = findViewById<EditText>(R.id.editTextText)

        button2.setOnClickListener { editTextText.text.clear() }

        button2
            .setOnClickListener {
            val editTextText = editTextText.text.toString()


            if (editTextText == "49") {
                textView.text = "Actor Kenneth Mitchell, best known for his roles in Star Trek: Discovery, died at age 49 on Feb. 24, five years after being diagnosed with ALS."

            } else if (editTextText == "40") {
                textView.text = " Pual Walker Actor who won the 2001 Hollywood Breakthrough Award for New Male Stylemaker for his performance as Brian O'Conner in The Fast and the Furious,dead at 30 Nov 2013"

            } else if (editTextText == "62") {
                textView.text = "Toby Keith, known for hits such as “Red Solo Cup” and “Should Have Been a Cowboy,” died on Feb. 5 after being diagnosed with stomach cancer in fall 2021. "

            } else if (editTextText == "76") {
                textView.text = "Carl Weather,died at age 76 on Feb. 1. His family confirmed the news in a statement to Deadline and Variety, saying that he \"died peacefully in his sleep.\""


            } else if (editTextText == "39") {
                textView.text = "Isabelle thomas,the wife of Killers of the Flower Moon producer Bradley Thomas, died by suicide at a Los Angeles hotel on Jan. 29, according to authorities"

            } else if (editTextText == "73") {
                textView.text = "Gary Graham, best known for his role in Star Trek: Enterprise, died at 73 on Jan. 22. The actor’s ex-wife, Susan Lavelle, shared the news in a Facebook post"

            } else if (editTextText == "62") {
                textView.text = "Dexter Scott King, the youngest son of Dr. Martin Luther King Jr. and Coretta Scott King, died at 62 on Jan."

            } else if (editTextText == "48") {
                textView.text = "Chris Gauthier ,known for his roles in Once Upon a Time, Eureka, and Smallville, died at age 48 on Feb."

            } else if (editTextText == "49") {
                textView.text = "Kenneth Mitchell, best known for his roles in Star Trek: Discovery, died at age 49 on Feb. 24, five years after being diagnosed with ALS."

            } else if (editTextText == "81") {
                textView.text = "Harry Johnson, well known for his roles on Battlestar Galactica and Law & Order, died at age 81. The actor died Jan."

            } else if (editTextText == "42") {
                textView.text = " Adan Canto, best known for his work on The Cleaning Lady and Designated Survivor, died at age 42 following a private journey with appendiceal cancer, according to The Wrap."

            } else if (editTextText == "80") {
                textView.text = "David Soul, best known for playing detective Kenneth \"Hutch\" Hutchinson on TV's Starsky & Hutch, died on Jan. 4 at age 80. "

            } else if (editTextText == "100") {
                textView.text = "Glynis Johns, the Academy Award-nominated actor who costarred with Julie Andrews in the classic 1964 film Mary Poppins as Winifred Banks, died at age 100 in January."

            } else if (editTextText == "53") {
                textView.text = "Angus Mitchell, the only child of hairstylist Paul Mitchell, was found dead in January. He was 53. "

            } else if (editTextText == "51") {
                textView.text = "Actor Christian Oliver was killed in a plane crash in January. Oliver, known for films including Speed Racer and The Baby-Sitters Club, was 51"

            } else if (editTextText == "81") {
                textView.text = "Harry Johnson, well known for his roles on Battlestar Galactica and Law & Order, died at age 81. The actor died Jan"

            } else if (editTextText == "35") {
                textView.text = "Dambudzo Marechera,(4 June 1952 – 18 August 1987) was a Zimbabwean novelist, short story writer, playwright and poet. His short career produced a book of stories, two novels (one published posthumously), a book of plays, prose, and poetry, and a collection of poetry (also posthumous). "

            } else if (editTextText == "50") {
                textView.text = "In January, actor Alec Musser died at age 50. His fiancée Paige Press announced the news on her Instagram Story, writing, \"RIP to the love of my life. "

            } else if (editTextText == "74") {
                textView.text = "DEREK WATSS,Veteran and seasoned journalist Derek Watts died at 74 years old surrounded by his loved ones. In 2022, he was diagnosed with skin cancer that rapidly spread to his lungs. He died on Tuesday, 22 August. "

            } else if (editTextText == "29") {
                textView.text = "MBULELI MATHANGA,was found hanging dead in his girlfriend’s room on 31 August in what is suspected to be a successful suicide. "

            } else if (editTextText == "81") {
                textView.text = "Simon Vengai Muzenda (28 October 1922 – 20 September 2003) was a Zimbabwean politician who served as Deputy Prime Minister from 1980 to 1987 and as Vice-President of Zimbabwe from 1987 to 2003 under President Robert Mugabe."

            } else if (editTextText == "37") {
                textView.text = "Allan Wilson,Allan Wilson (1856 – 4 December 1893) was an officer in the Victoria Volunteers. He is best known for his leadership of the Shangani Patrol in the First Matabele War. His death fighting overwhelming odds made him a national hero in Britain and Rhodesia"

            } else {
                textView.text = "Enter Valid Age"

            }
        }
    }
}




