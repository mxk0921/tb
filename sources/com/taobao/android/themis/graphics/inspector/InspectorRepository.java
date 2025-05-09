package com.taobao.android.themis.graphics.inspector;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class InspectorRepository {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static e f9671a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum HOST {
        DAILY,
        ONLINE
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum JSType {
        JS,
        BINARY
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f9672a;

        public a(InspectorRepository inspectorRepository, d dVar) {
            this.f9672a = dVar;
        }

        @Override // com.taobao.android.themis.graphics.inspector.InspectorRepository.d
        public void a(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eacf53ef", new Object[]{this, eVar});
                return;
            }
            if (eVar != null && eVar.a()) {
                InspectorRepository.a(eVar);
            }
            this.f9672a.a(eVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c extends InspectorRepository {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final String b;
        public final b c;
        public final JSType d;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements b.a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ d f9674a;

            public a(d dVar) {
                this.f9674a = dVar;
            }

            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("219db244", new Object[]{this});
                } else {
                    this.f9674a.a(null);
                }
            }

            public void b(byte[] bArr) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f354e551", new Object[]{this, bArr});
                    return;
                }
                e eVar = new e();
                eVar.b = c.e(c.this);
                eVar.f9675a = bArr;
                eVar.c = c.f(c.this);
                this.f9674a.a(eVar);
            }
        }

        public c(HOST host, JSType jSType) {
            super(host);
            String str;
            String str2;
            StringBuilder sb = new StringBuilder();
            if (host == HOST.DAILY) {
                str = "https://dev.g.alicdn.com/ThemisBrings/themis-gpu-inspector/";
            } else {
                str = "https://g.alicdn.com/ThemisBrings/themis-gpu-inspector/";
            }
            sb.append(str);
            sb.append("0.0.1/dist/");
            if (jSType == JSType.JS) {
                str2 = "index.bundle.js";
            } else {
                str2 = "index.bundle.v20.wlm";
            }
            sb.append(str2);
            String sb2 = sb.toString();
            this.b = sb2;
            this.d = jSType;
            Log.e("themis:inspector", "will fetch inspector from: " + sb2);
            this.c = new b();
        }

        public static /* synthetic */ String e(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ebf81fa4", new Object[]{cVar});
            }
            return cVar.b;
        }

        public static /* synthetic */ JSType f(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSType) ipChange.ipc$dispatch("98ba9740", new Object[]{cVar});
            }
            return cVar.d;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/themis/graphics/inspector/InspectorRepository$InspectorRepoCDN");
        }

        @Override // com.taobao.android.themis.graphics.inspector.InspectorRepository
        public void d(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b05335e8", new Object[]{this, dVar});
            } else {
                this.c.b(this.b, new a(dVar));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface d {
        void a(e eVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public byte[] f9675a;
        public String b;
        public JSType c;

        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
            }
            byte[] bArr = this.f9675a;
            if (bArr == null || bArr.length <= 0 || TextUtils.isEmpty(this.b) || this.c == null) {
                return false;
            }
            return true;
        }
    }

    public InspectorRepository(HOST host) {
    }

    public static /* synthetic */ e a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("c4f54d4d", new Object[]{eVar});
        }
        f9671a = eVar;
        return eVar;
    }

    public static InspectorRepository b(HOST host, JSType jSType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InspectorRepository) ipChange.ipc$dispatch("d96c4062", new Object[]{host, jSType});
        }
        return new c(host, jSType);
    }

    public void c(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c244c72", new Object[]{this, dVar});
        } else if (dVar != null) {
            try {
                e eVar = f9671a;
                if (eVar == null || !eVar.a()) {
                    d(new a(this, dVar));
                } else {
                    dVar.a(f9671a);
                }
            } catch (Throwable th) {
                Log.e("themis:inspector", "failed to load resource: " + th.getMessage());
                dVar.a(null);
            }
        }
    }

    public abstract void d(d dVar);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b extends AsyncTask<String, Void, byte[]> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public a f9673a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public interface a {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/themis/graphics/inspector/InspectorRepository$Downloader");
        }

        public synchronized void b(String str, a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("156cf95d", new Object[]{this, str, aVar});
                return;
            }
            this.f9673a = aVar;
            execute(str);
        }

        /* renamed from: c */
        public void onPostExecute(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7d2d2664", new Object[]{this, bArr});
            } else if (bArr == null || bArr.length <= 0) {
                ((c.a) this.f9673a).a();
            } else {
                ((c.a) this.f9673a).b(bArr);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:73:0x015f  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x017e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:91:0x0164 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r0v0 */
        /* JADX WARN: Type inference failed for: r0v13 */
        /* JADX WARN: Type inference failed for: r0v17 */
        /* JADX WARN: Type inference failed for: r4v3 */
        /* JADX WARN: Type inference failed for: r5v0, types: [boolean] */
        /* JADX WARN: Type inference failed for: r5v7, types: [java.net.HttpURLConnection, java.net.URLConnection] */
        /* JADX WARN: Unknown variable types count: 2 */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public byte[] doInBackground(java.lang.String... r11) {
            /*
                Method dump skipped, instructions count: 407
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.themis.graphics.inspector.InspectorRepository.b.doInBackground(java.lang.String[]):byte[]");
        }
    }
}
