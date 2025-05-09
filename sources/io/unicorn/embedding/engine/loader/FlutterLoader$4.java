package io.unicorn.embedding.engine.loader;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import io.unicorn.embedding.engine.FlutterJNI;
import tb.dwh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
class FlutterLoader$4 extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        Log.e(dwh.TAG, "[Timeline] android broadcast receiver got: " + action);
        if ("com.taobao.unicorn.tracing_start".equals(action)) {
            FlutterJNI.nativeSwitchTraceState(true);
        } else if ("com.taobao.unicorn.tracing_stop".equals(action)) {
            FlutterJNI.nativeSwitchTraceState(false);
        }
    }
}
