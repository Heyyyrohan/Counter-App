<h1>📱 MVVM Counter App</h1>
<p>A simple Android app built with <b>Jetpack Compose</b> and <b>MVVM architecture</b> that lets you increase and reset a counter value. Perfect as a beginner project to learn <b>state management</b> in Compose using <code>ViewModel</code> and <code>StateFlow</code>.</p>

<h2>🚀 Features</h2>
<ul>
<li>Increase and reset counter with one tap</li>
<li>Real-time UI updates using <code>StateFlow</code></li>
<li>MVVM architecture for clean separation of UI and logic</li>
<li>Works after configuration changes (ViewModel)</li>
</ul>

<h2>🛠 Tech Stack</h2>
<ul>
<li><b>Language:</b> Kotlin</li>
<li><b>UI Framework:</b> Jetpack Compose</li>
<li><b>Architecture:</b> MVVM</li>
<li><b>State Management:</b> StateFlow</li>
</ul>

<h2>📂 Project Structure</h2>
<code>
com.example.counterapp<br>
│<br>
├── CounterViewModel.kt   # ViewModel containing app state and logic<br>
├── CounterScreen.kt      # Composable UI observing ViewModel state<br>
└── MainActivity.kt       # App entry point<br>
</code>

<h2>📸 Screenshots</h2>
<img width="270" height="570" alt="CounterSS01" src="https://github.com/user-attachments/assets/1def2d69-893c-4ec4-9b91-37ab5c8c7577" />
<img width="270" height="570" alt="CounterSS02" src="https://github.com/user-attachments/assets/629d4d3f-2b59-42ac-afb5-65a7886be7e2" />


<h2>💻 How to Run</h2>
<ol>
<li>Clone the repository:<br>
<code>git clone  https://github.com/Heyyyrohan/Counter-App.git
  <br>cd mvvm-counter-app</code></li>
<li>Open in <b>Android Studio</b></li>
<li>Sync Gradle</li>
<li>Run the app on an emulator or device</li>
</ol>

<h2>📚 Learning Goals</h2>
<ul>
<li>Understand how <code>ViewModel</code> manages UI state</li>
<li>Use <code>StateFlow</code> with Jetpack Compose</li>
<li>Benefits of MVVM over keeping state in Composables</li>
<li>Preview UI in Android Studio without running the app</li>
</ul>

<h2>📝 Example Code</h2>
<h3>CounterViewModel.kt</h3>
<code>
package com.example.counterapp<br>
<br>
import androidx.lifecycle.ViewModel<br>
import kotlinx.coroutines.flow.MutableStateFlow<br>
import kotlinx.coroutines.flow.asStateFlow<br>
<br>
class CounterViewModel : ViewModel() {<br>
    private val _count = MutableStateFlow(0)<br>
    val count = _count.asStateFlow()<br>
<br>
    fun increase() { _count.value += 1 }<br>
    fun reset() { _count.value = 0 }<br>
}<br>
</code>

<h3>CounterScreen.kt</h3>
<code>
@Composable<br>
fun CounterScreen(vm: CounterViewModel = viewModel()) {<br>
    val count = vm.count.collectAsState().value<br>
<br>
    Column(...) {<br>
        Text(text = "${count}", fontSize = 95.sp)<br>
        // ... buttons call vm.increase() and vm.reset()<br>
    }<br>
}<br>
</code>

<h2>📝 License</h2>
<p>This project is licensed under the <b>MIT License</b>. See the <code>LICENSE</code> file for details.</p>

