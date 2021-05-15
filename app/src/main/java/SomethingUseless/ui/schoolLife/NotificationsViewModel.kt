package SomethingUseless.ui.schoolLife

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NotificationsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "校园生活"
    }
    val text: LiveData<String> = _text
}