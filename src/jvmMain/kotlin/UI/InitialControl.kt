package UI

import UI.ADD.AddPersonnel
import UI.Modify.ModifyPersonnel
import UI.Oper.Nav3
import UI.PersonnelNav.Navpersonnel
import UI.Routed._Nav2
import UI.Routes._Nav1
import UI.Titres.titre
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun InitialControl()
{
    lateinit var retour : String
    Column(modifier = Modifier.fillMaxHeight()) {
        when(_Nav1.value)
        {
           /* 0 ->{ Bio()


            }*/
            0 ->{
                Dashboard()
                }
            1 ->{
                Organisation()


            }
            2->{
                Recherches()

            }
            3 ->{

                when(_Nav2.value)
                {
                    "Personnel"->{

                        Personnel()

                    }

                    "Ajouter" ->{
                        titre.value ="Ajouter un Personnel"

                        Nav3.value ="ajouter"

                        when(Navpersonnel.value)
                       {
                           "Administration"->{
                               retour = "Administration"

                           }
                               "Comptabilité"->{
                                    retour ="Comptabilité"
                               }
                           "Suivi-Evaluation"->{
                                retour ="Suivi-Evaluation"
                           }
                           "Caisse"->{
                                retour ="Caisse"
                           }
                               "Assistant Médical"->{
                                    retour ="Assistant Médical"
                               }
                           "Médecin"->{
                                retour ="Médecin"
                           }
                           "Infirmerie"->{
                                retour ="Infirmerie"
                           }
                               "Sécurité-Entretien"->{
                                    retour ="Sécurité-Entretien"
                               }
                       }
                        AddPersonnel( retour)

                        /*when(Navajouter.value)
                        {



                        }*/
                    }
                    "Modifier"->{
                        titre.value ="Modifier un Personnel"
                        Nav3.value ="modifier"
                        when(Navpersonnel.value)
                        {
                            "Administration"->{
                                retour = "Administration"

                            }
                            "Comptabilité"->{
                                retour ="Comptabilité"
                            }
                            "Suivi-Evaluation"->{
                                retour ="Suivi-Evaluation"
                            }
                            "Caisse"->{
                                retour ="Caisse"
                            }
                            "Assistant Médical"->{
                                retour ="Assistant Médical"
                            }
                            "Médecin"->{
                                retour ="Médecin"
                            }
                            "Infirmerie"->{
                                retour ="Infirmerie"
                            }
                            "Sécurité-Entretien"->{
                                retour ="Sécurité-Entretien"
                            }
                        }
                        AddPersonnel( retour)

                        /*when(Navmodifier.value)
                        {

                        }*/
                    }

                }

            }
            5->{
                 }
            6->{
                //

            }

            7->{
                // ChooseFileScreen()
            }
        }






    }
}