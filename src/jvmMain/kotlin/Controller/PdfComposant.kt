package Controller

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import java.io.File

data class PdfComposant(
    val nom : String
)

object PdfElement
{
    var pdfitem = mutableStateOf(mutableListOf<File?>())
    val _pdfitem : State<MutableList<File?>> = pdfitem
    val pdfitems = mutableStateListOf(*pdfitem.value.toTypedArray())
}