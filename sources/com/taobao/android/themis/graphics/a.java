package com.taobao.android.themis.graphics;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.android.themis.graphics.IRiverBackend;
import com.taobao.android.themis.graphics.JNIBridge;
import com.taobao.android.themis.graphics.audio.AudioContextFactory;
import com.taobao.android.themis.graphics.inspector.a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import tb.hqf;
import tb.lcn;
import tb.s5u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a implements IRiverBackend {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public JNIBridge f9649a;
    public final s5u b;
    public final String c;
    public final Application d;
    public final boolean e;
    public final String f;
    public final com.taobao.android.themis.graphics.inspector.a g;
    public final IRiverBackend.EngineType h;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.themis.graphics.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class C0497a implements JNIBridge.n {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public C0497a(a aVar) {
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ca188908", new Object[]{this});
            } else {
                lcn.f(RVLLevel.Error, "themis:runtime", "onLibraryLoaded!");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements a.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f9650a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public b(String str, String str2, String str3) {
            this.f9650a = str;
            this.b = str2;
            this.c = str3;
        }

        @Override // com.taobao.android.themis.graphics.inspector.a.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("420d7c24", new Object[]{this});
            } else {
                a.a(a.this).executeScriptInAppContext(this.f9650a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements a.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ byte[] f9651a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public c(byte[] bArr, String str, String str2) {
            this.f9651a = bArr;
            this.b = str;
            this.c = str2;
        }

        @Override // com.taobao.android.themis.graphics.inspector.a.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("420d7c24", new Object[]{this});
            } else {
                a.a(a.this).executeBytecodeInAppContext(this.f9651a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                Toast.makeText(a.b(a.this).getApplicationContext(), "js memory leaked!", 1).show();
            } catch (Throwable th) {
                Log.e("themis:runtime", "unexpected error: " + th.getMessage());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public String f9653a;
        public JNIBridge.i b;
        public JNIBridge.k c;
        public JNIBridge.l d;
        public JNIBridge.m e;
        public AudioContextFactory.a f;
        public JNIBridge.j g;
        public JNIBridge.o h;
        public boolean i;
        public float j;
        public Application k;
        public boolean l = false;
        public IRiverBackend.EngineType m = IRiverBackend.EngineType.Qking;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public JNIBridge.i f9654a;
        public JNIBridge.k b;
        public JNIBridge.l c;
        public JNIBridge.m d;
        public AudioContextFactory.a e;
        public JNIBridge.j f;
        public JNIBridge.o g;
        public final String h;
        public float i;
        public boolean j;
        public IRiverBackend.EngineType k;
        public final Application l;
        public boolean m;

        public f(Application application, String str) {
            this.h = str;
            this.l = application;
        }

        public e a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("b32432c8", new Object[]{this});
            }
            e eVar = new e();
            eVar.b = this.f9654a;
            eVar.c = this.b;
            eVar.d = this.c;
            eVar.e = this.d;
            eVar.g = this.f;
            eVar.f9653a = this.h;
            eVar.j = this.i;
            eVar.k = this.l;
            eVar.l = this.j;
            eVar.f = this.e;
            eVar.m = this.k;
            eVar.h = this.g;
            eVar.i = this.m;
            return eVar;
        }

        public f b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("5aa36242", new Object[]{this, new Boolean(z)});
            }
            this.m = z;
            return this;
        }

        public f c(JNIBridge.i iVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("34f2324f", new Object[]{this, iVar});
            }
            this.f9654a = iVar;
            return this;
        }

        public f d(JNIBridge.j jVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("b4783669", new Object[]{this, jVar});
            }
            this.f = jVar;
            return this;
        }

        public f e(AudioContextFactory.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("f376dfce", new Object[]{this, aVar});
            }
            this.e = aVar;
            return this;
        }

        public f f(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("9dd8a32b", new Object[]{this, new Boolean(z)});
            }
            this.j = z;
            return this;
        }

        public f g(JNIBridge.m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("ef9aae12", new Object[]{this, mVar});
            }
            this.d = mVar;
            return this;
        }

        public f h(IRiverBackend.EngineType engineType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("fd8ed5f6", new Object[]{this, engineType});
            }
            this.k = engineType;
            return this;
        }

        public f i(JNIBridge.k kVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("2d382ad5", new Object[]{this, kVar});
            }
            this.b = kVar;
            return this;
        }

        public f j(JNIBridge.l lVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("db39c4f3", new Object[]{this, lVar});
            }
            this.c = lVar;
            return this;
        }

        public f k(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("2c81f185", new Object[]{this, new Float(f)});
            }
            this.i = f;
            return this;
        }

        public f l(JNIBridge.o oVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("13169595", new Object[]{this, oVar});
            }
            this.g = oVar;
            return this;
        }
    }

    public a(e eVar) {
        boolean z = false;
        this.e = false;
        this.h = IRiverBackend.EngineType.Qking;
        JNIBridge.setOnLibraryLoadedListener(new C0497a(this));
        IRiverBackend.EngineType engineType = eVar.m;
        this.h = engineType;
        if (engineType != IRiverBackend.EngineType.V8 || j()) {
            JNIBridge jNIBridge = new JNIBridge(eVar.b, eVar.i);
            this.f9649a = jNIBridge;
            jNIBridge.setOnJSErrorListener(eVar.c);
            this.f9649a.setOnJSMemoryListener(eVar.d);
            this.f9649a.setOnJSNotResponseListener(eVar.e);
            this.f9649a.setOnAPIStatsListener(eVar.g);
            this.f9649a.setOnSourceMapListener(eVar.h);
            this.f9649a.setAudioContextFactory(new AudioContextFactory(eVar.f));
            this.c = eVar.f9653a;
            this.b = new s5u(this.f9649a, eVar.j);
            if (eVar.l) {
                this.g = new com.taobao.android.themis.graphics.inspector.a(new WeakReference(this));
            }
            Application application = eVar.k;
            if (application != null) {
                try {
                    lcn.n(application);
                } catch (Throwable th) {
                    Log.e("themis:runtime", "setup river logger failed:" + th.getMessage());
                }
                try {
                    Application application2 = eVar.k;
                    this.d = application2;
                    ApplicationInfo applicationInfo = application2.getApplicationInfo();
                    this.f = applicationInfo.dataDir;
                    this.e = (applicationInfo.flags & 2) != 0 ? true : z;
                } catch (Throwable th2) {
                    RVLLevel rVLLevel = RVLLevel.Error;
                    lcn.f(rVLLevel, "themis:runtime", "failed to get application info: " + th2.getMessage());
                }
            }
            lcn.f(RVLLevel.Error, "themis:runtime", "themis runtime create success!");
            return;
        }
        throw new Error("failed to init themis graphics with V8 engine because of jsi not available!");
    }

    public static /* synthetic */ JNIBridge a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JNIBridge) ipChange.ipc$dispatch("29cb4be7", new Object[]{aVar});
        }
        return aVar.f9649a;
    }

    public static /* synthetic */ Application b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("dd272fac", new Object[]{aVar});
        }
        return aVar.d;
    }

    public boolean c() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ad9c850", new Object[]{this})).booleanValue();
        }
        IRiverBackend.EngineType engineType = this.h;
        if (engineType == null) {
            engineType = IRiverBackend.EngineType.Qking;
        }
        JNIBridge jNIBridge = this.f9649a;
        String str = this.c;
        String str2 = this.f;
        if (this.g != null) {
            z = true;
        }
        return jNIBridge.attach(str, engineType, str2, z);
    }

    public void e(byte[] bArr, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b135b7f", new Object[]{this, bArr, str, str2});
            return;
        }
        com.taobao.android.themis.graphics.inspector.a aVar = this.g;
        if (aVar != null) {
            aVar.b(new c(bArr, str, str2));
        } else {
            this.f9649a.executeBytecodeInAppContext(bArr, str, str2);
        }
    }

    public void f(byte[] bArr, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a383d156", new Object[]{this, bArr, str, str2});
        } else {
            this.f9649a.executeByteCodeInCurrentThread(bArr, str, str2);
        }
    }

    public void g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab58bb2e", new Object[]{this, str, str2});
        } else {
            h(str, str2, "");
        }
    }

    public void h(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7222b578", new Object[]{this, str, str2, str3});
            return;
        }
        com.taobao.android.themis.graphics.inspector.a aVar = this.g;
        if (aVar != null) {
            aVar.b(new b(str, str2, str3));
        } else {
            this.f9649a.executeScriptInAppContext(str, str2, str3);
        }
    }

    public void i(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("719e1ca3", new Object[]{this, str, str2, str3});
        } else {
            this.f9649a.executeScriptInCurrentThread(str, str2, str3);
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa5e31f6", new Object[]{this});
        } else if (this.h != IRiverBackend.EngineType.Qking) {
            try {
                hqf.stopRemoteInspect();
            } catch (Throwable th) {
                RVLLevel rVLLevel = RVLLevel.Error;
                lcn.f(rVLLevel, "themis:runtime", "unexpected error " + th.getMessage());
            }
        }
    }

    @Override // com.taobao.android.themis.graphics.IRiverBackend
    public void p(String str, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("361bb065", new Object[]{this, str, jSONObject, new Boolean(z)});
        } else {
            this.f9649a.fireGlobalEventInMainContext(str, jSONObject, z);
        }
    }

    @Override // com.taobao.android.themis.graphics.IRiverBackend
    public void q(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6912719", new Object[]{this, str, str2});
        } else {
            this.f9649a.executeScriptInCurrentThread(str, str2, "");
        }
    }

    @Override // com.taobao.android.themis.graphics.IRiverBackend
    public boolean r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f43d3ac", new Object[]{this, str})).booleanValue();
        }
        return this.f9649a.hasRegisterGlobalEventInMainContext(str);
    }

    @Override // com.taobao.android.themis.graphics.IRiverBackend
    public void s(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b09b3fac", new Object[]{this, str, str2});
        } else {
            this.f9649a.executeScriptInMainContext(str, str2);
        }
    }

    @Override // com.taobao.android.themis.graphics.IRiverBackend
    public void t(byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("748cc69f", new Object[]{this, bArr, str});
        } else {
            this.f9649a.executeBytecodeInMainContext(bArr, str);
        }
    }

    @Override // com.taobao.android.themis.graphics.IRiverBackend
    public void u(byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13d9b28c", new Object[]{this, bArr, str});
        } else {
            this.f9649a.executeByteCodeInCurrentThread(bArr, str, "");
        }
    }

    @Override // com.taobao.android.themis.graphics.IRiverBackend
    public void v(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1ab422", new Object[]{this, hashMap});
            return;
        }
        if (hashMap == null) {
            hashMap = new HashMap<>(1);
        }
        this.f9649a.createAppContext(hashMap);
    }

    @Override // com.taobao.android.themis.graphics.IRiverBackend
    public void w(byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("275fa4f5", new Object[]{this, bArr, str});
        } else {
            e(bArr, str, "");
        }
    }

    @Override // com.taobao.android.themis.graphics.IRiverBackend
    public void x(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4ba8905", new Object[]{this, map});
        } else if (map != null && map.size() != 0) {
            try {
                this.f9649a.updateOrangeConfigs(JSON.toJSONString(map));
            } catch (Throwable th) {
                RVLLevel rVLLevel = RVLLevel.Error;
                lcn.f(rVLLevel, "themis:runtime", "failed to update orange config because of " + th.getMessage());
            }
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7b39a9a", new Object[]{this});
            return;
        }
        lcn.f(RVLLevel.Error, "themis:runtime", "themis runtime will be detached");
        if (this.f9649a.detach() && this.e && this.d != null) {
            try {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    Toast.makeText(this.d.getApplicationContext(), "js memory leaked!", 1).show();
                } else {
                    new Handler(Looper.getMainLooper()).post(new d());
                }
            } catch (Throwable th) {
                RVLLevel rVLLevel = RVLLevel.Error;
                lcn.f(rVLLevel, "themis:runtime", "unexpected error: " + th.getMessage());
            }
        }
        this.f9649a = null;
    }

    @Override // com.taobao.android.themis.graphics.IRiverBackend
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        s5u s5uVar = this.b;
        if (s5uVar != null) {
            try {
                return s5uVar.c(motionEvent);
            } catch (Throwable th) {
                RVLLevel rVLLevel = RVLLevel.Error;
                lcn.f(rVLLevel, "themis:runtime", "failed to dispatch touch event because of " + th.getMessage());
            }
        }
        return false;
    }

    public boolean k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("683e89e4", new Object[]{this, str})).booleanValue();
        }
        if (this.h == IRiverBackend.EngineType.Qking) {
            return false;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                return hqf.startRemoteInspect(str);
            }
        } catch (Throwable th) {
            RVLLevel rVLLevel = RVLLevel.Error;
            lcn.f(rVLLevel, "themis:runtime", "unexpected error " + th.getMessage());
        }
        return false;
    }

    public final boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eccd3194", new Object[]{this})).booleanValue();
        }
        try {
            return hqf.isEngineReady(1);
        } catch (Throwable th) {
            RVLLevel rVLLevel = RVLLevel.Error;
            lcn.f(rVLLevel, "themis:runtime", "unexpected error " + th.getMessage());
            return false;
        }
    }
}
