The following command line args can be supplied to customize the behaviour or the Godot Kotlin/JVM binding:

| Argument | Default value | Description | Example |
| --- | --- | --- | --- |
| --java-vm-type | jvm | Defines the VM to run on. Possible values are `jvm` and `graal_native_image`. When set to `graal_native_image` it uses Graal native image. This has no effect on android platform. |
| --jvm-debug-port | | Defines the port to which you can attach a remote debugger. **Note:** the module `jdk.jdwp.agent` is needed in the embedded JRE if you want to debug your application. If you need `jmx`, also the module `jdk.management.agent` is needed | `--jvm-debug-port=5005` |
| --jvm-debug-address | | Defines which adresses are allowed for debugging | `--jvm-debug-address=localhost` |
| --wait-for-debugger | true | Accepted values: `true` or `false`. Defines if the jvm should suspend execution until a remote debugger is attached. Only effective if either `--jvm-debug-port` or `--jvm-debug-address` is set | `--wait-for-debugger=true` |
| --jvm-jmx-port | | Defines the jmx port. **Note:** the module `jdk.management.agent` is needed in the embedded JRE to be able to use jmx | `--jvm-jmx-port=5006` |
| --jvm-to-engine-max-string-size | 512 | Maximun size of strings sent through the buffer. When above that value, strings are sent with a slower JNI Call. A bigger size means a bigger buffer. Increase if you need a lot of long strings and don't mind using more memory. One buffer exists for each thread | `--jvm-to-engine-max-string-size=512` |
| --jvm-force-gc | | If set the JVM GC is forced to run when our own GC runs. | `--jvm-force-gc` |
| --jvm-disable-gc | | Disables our GC. **Caution:** If you disable our GC you **will** have memory leaks as all Reference types and Native Types are not Garbage collected anymore | `--jvm-disable-gc` |
| --jvm-disable-closing-leaks-warning | | Disables the output of leaked instances when closing the application | `--jvm-disable-closing-leaks-warning` |