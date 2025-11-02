package z.gnstc.uwv.ui.main

import androidx.fragment.app.Fragment

abstract class MainFragment : Fragment() {
    protected val activity: MainActivity get() = requireActivity() as MainActivity
}