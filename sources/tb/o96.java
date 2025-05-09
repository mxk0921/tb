package tb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class o96 implements xnj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEVTOOLS_ENTRY_CLASS = "com.taobao.android.dinamicx.devtools.DevtoolsInitializer";

    public static void a(String str) {
        try {
            Class<?> cls = Class.forName(DEVTOOLS_ENTRY_CLASS);
            Context x = DinamicXEngine.x();
            if (x != null) {
                cls.getMethod("launch", Context.class, String.class).invoke(null, x, str);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // tb.xnj
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return "DXRealTimeDebugProcessor";
    }

    @Override // tb.xnj
    public boolean process(Intent intent, zmj zmjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3ebca67", new Object[]{this, intent, zmjVar})).booleanValue();
        }
        if (!(intent == null || intent.getData() == null)) {
            try {
                Uri data = intent.getData();
                if (data.isHierarchical() && !TextUtils.isEmpty(data.getQueryParameter("dx_debugger"))) {
                    a(data.toString());
                }
            } catch (Throwable unused) {
            }
        }
        return true;
    }

    @Override // tb.xnj
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }
}
