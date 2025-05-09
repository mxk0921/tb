package tb;

import android.content.Context;
import android.content.Intent;
import com.heytap.msp.push.callback.IDataMessageCallBackService;
import com.heytap.msp.push.mode.BaseMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class z5n {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f32554a;
        final /* synthetic */ Intent b;
        final /* synthetic */ IDataMessageCallBackService c;

        public a(Context context, Intent intent, IDataMessageCallBackService iDataMessageCallBackService) {
            this.f32554a = context;
            this.b = intent;
            this.c = iDataMessageCallBackService;
        }

        @Override // java.lang.Runnable
        public void run() {
            List<BaseMode> b = vpi.b(this.f32554a, this.b);
            if (b != null) {
                Iterator it = ((ArrayList) b).iterator();
                while (it.hasNext()) {
                    BaseMode baseMode = (BaseMode) it.next();
                    if (baseMode != null) {
                        Iterator it2 = ((ArrayList) b6n.s().y()).iterator();
                        while (it2.hasNext()) {
                            fzm fzmVar = (fzm) it2.next();
                            if (fzmVar != null) {
                                fzmVar.a(this.f32554a, baseMode, this.c);
                            }
                        }
                    }
                }
            }
        }
    }

    static {
        t2o.a(612368386);
    }

    public static void a(Context context, Intent intent, IDataMessageCallBackService iDataMessageCallBackService) {
        if (context == null) {
            dgh.b("context is null , please check param of parseIntent()");
        } else if (intent == null) {
            dgh.b("intent is null , please check param of parseIntent()");
        } else if (iDataMessageCallBackService == null) {
            dgh.b("callback is null , please check param of parseIntent()");
        } else if (!yyv.h(context)) {
            dgh.b("push is null ,please check system has push");
        } else {
            wrt.a(new a(context, intent, iDataMessageCallBackService));
        }
    }
}
