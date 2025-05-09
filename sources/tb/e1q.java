package tb;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.skin.SkinConfig;
import com.taobao.tao.log.TLog;
import java.util.List;
import java.util.Map;
import tb.i1q;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class e1q extends AsyncTask<Void, Void, Void> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final SkinConfig f18213a;
    public final String b;
    public final xkb c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends TypeReference<Map<String, Map<String, String>>> {
        public a(e1q e1qVar) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements i1q.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f18214a;
        public final List<String> b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements i1q.b {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // tb.i1q.b
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a1170927", new Object[]{this});
                    return;
                }
                b bVar = b.this;
                new c(b.b(bVar)).execute(new Void[0]);
            }

            @Override // tb.i1q.b
            public void onFailure(String str, String str2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("cccc2dc6", new Object[]{this, str, str2});
                    return;
                }
                xkb b = e1q.b(e1q.this);
                String a2 = e1q.a(e1q.this);
                b.onError(a2, "DOWNLOAD_ERROR", "Download failed, please retry." + str2);
            }
        }

        static {
            t2o.a(464519233);
            t2o.a(464519197);
        }

        public b(byte[] bArr, List<String> list) {
            this.f18214a = bArr;
            this.b = list;
        }

        public static /* synthetic */ byte[] b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("811d889b", new Object[]{bVar});
            }
            return bVar.f18214a;
        }

        @Override // tb.i1q.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a1170927", new Object[]{this});
            } else {
                new c(this.f18214a).execute(new Void[0]);
            }
        }

        @Override // tb.i1q.b
        public void onFailure(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cccc2dc6", new Object[]{this, str, str2});
                return;
            }
            if (i1q.TYPE_PHENIX.equals(str)) {
                xkb b = e1q.b(e1q.this);
                String a2 = e1q.a(e1q.this);
                b.onError(a2, "DOWNLOAD_ERROR", "Download failed, please retry." + str2);
            } else {
                new i1q().c(this.b, new a());
            }
            TLog.loge("SkinDownloadTask", "onFailure", str2 + e1q.a(e1q.this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c extends AsyncTask<Void, Void, h1q<Void>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f18216a;

        static {
            t2o.a(464519235);
        }

        public c(byte[] bArr) {
            this.f18216a = bArr;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/festival/skin/SkinDownloadTask$WriteConfigTask");
        }

        /* renamed from: a */
        public h1q<Void> doInBackground(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (h1q) ipChange.ipc$dispatch("5b38ec44", new Object[]{this, voidArr});
            }
            return k1q.q().B(e1q.c(e1q.this), this.f18216a);
        }

        /* renamed from: b */
        public void onPostExecute(h1q<Void> h1qVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f59efce2", new Object[]{this, h1qVar});
                return;
            }
            boolean a2 = h1qVar.a();
            if (a2) {
                e1q.b(e1q.this).onSuccess(e1q.a(e1q.this));
            } else {
                e1q.b(e1q.this).onError(e1q.a(e1q.this), "IO_ERROR", "updateFile file error.");
            }
            TLog.loge("SkinDownloadTask", "onPostExecute", "onPostExecute" + a2);
        }
    }

    static {
        t2o.a(464519231);
    }

    public e1q(String str, SkinConfig skinConfig, xkb xkbVar) {
        this.f18213a = skinConfig;
        this.b = str;
        this.c = xkbVar;
    }

    public static /* synthetic */ String a(e1q e1qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e00f302e", new Object[]{e1qVar});
        }
        return e1qVar.b;
    }

    public static /* synthetic */ xkb b(e1q e1qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xkb) ipChange.ipc$dispatch("8fcbd3d7", new Object[]{e1qVar});
        }
        return e1qVar.c;
    }

    public static /* synthetic */ SkinConfig c(e1q e1qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SkinConfig) ipChange.ipc$dispatch("c0de2c13", new Object[]{e1qVar});
        }
        return e1qVar.f18213a;
    }

    public static /* synthetic */ Object ipc$super(e1q e1qVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/festival/skin/SkinDownloadTask");
    }

    /* renamed from: d */
    public Void doInBackground(Void... voidArr) {
        byte[] a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Void) ipChange.ipc$dispatch("6194eca6", new Object[]{this, voidArr});
        }
        try {
            k1q.q().i();
            a2 = f1q.a(this.f18213a.skinUrl);
        } catch (Throwable th) {
            this.c.onError(this.b, "DOWNLOAD_ERROR", "Download failed.");
            TLog.loge("SkinDownloadTask", "doInBackground", th.getMessage() + this.b);
        }
        if (a2 == null || a2.length <= 0) {
            this.c.onError(this.b, "DOWNLOAD_ERROR", "Download failed. .");
            TLog.loge("SkinDownloadTask", "doInBackground", "Empty Bytes" + this.b);
            return null;
        }
        Map map = (Map) JSON.parseObject(new String(a2), new a(this), new Feature[0]);
        if (map != null && !map.isEmpty()) {
            List<String> a3 = n1q.a(map);
            if (a3.isEmpty()) {
                boolean a4 = k1q.q().B(this.f18213a, a2).a();
                if (a4) {
                    this.c.onSuccess(this.b);
                } else {
                    this.c.onError(this.b, "IO_ERROR", "updateFile file error.");
                }
                TLog.loge("SkinDownloadTask", "doInBackground", "commit" + a4);
            } else {
                i1q i1qVar = new i1q();
                b bVar = new b(a2, a3);
                if (!TextUtils.isEmpty(this.f18213a.skinZipUrl)) {
                    SkinConfig skinConfig = this.f18213a;
                    i1qVar.d(skinConfig.skinCode, skinConfig.skinZipUrl, bVar);
                } else {
                    i1qVar.c(a3, bVar);
                }
                TLog.loge("SkinDownloadTask", "doInBackground", "preload");
            }
            return null;
        }
        this.c.onError(this.b, "DOWNLOAD_ERROR", "json parse error. empty skinData.");
        TLog.loge("SkinDownloadTask", "doInBackground", "empty skinData" + this.b);
        return null;
    }
}
