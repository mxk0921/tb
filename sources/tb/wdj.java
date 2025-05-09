package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai2.material.MaterialDataServer;
import com.taobao.taopai2.material.business.musicdetail.MusicItemBean;
import com.taobao.taopai2.material.business.res.MusicResource;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class wdj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DL_STATE_FAIL = 3;
    public static final int DL_STATE_IDLE = 0;
    public static final int DL_STATE_RUNNING = 1;
    public static final int DL_STATE_SUCCESS = 2;

    /* renamed from: a  reason: collision with root package name */
    public final MaterialDataServer f30634a;
    public final frc b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Throwable f30635a;

        public a(Throwable th) {
            this.f30635a = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                wdj.d(wdj.this).onFail("exception", this.f30635a.getMessage());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements crc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e[] f30636a;
        public final /* synthetic */ MusicResource b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ MusicItemBean d;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class a implements crc {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // tb.crc
            public void a(String str, String str2, String str3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("6558de82", new Object[]{this, str, str2, str3});
                    return;
                }
                b bVar = b.this;
                e[] eVarArr = bVar.f30636a;
                eVarArr[0].f30640a = 3;
                wdj.c(wdj.this, eVarArr, bVar.b);
            }

            @Override // tb.crc
            public void b(String str, String str2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("2b538f3f", new Object[]{this, str, str2});
                    return;
                }
                if (TextUtils.isEmpty(str2)) {
                    b.this.f30636a[1].f30640a = 3;
                } else if (!new File(str2).exists()) {
                    b.this.f30636a[1].f30640a = 3;
                } else {
                    e eVar = b.this.f30636a[1];
                    eVar.f30640a = 2;
                    eVar.getClass();
                    b.this.b.musicWavePath = str2;
                }
                b bVar = b.this;
                wdj.c(wdj.this, bVar.f30636a, bVar.b);
            }

            @Override // tb.crc
            public void onProgress(String str, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("947093e6", new Object[]{this, str, new Integer(i)});
                }
            }
        }

        /* compiled from: Taobao */
        /* renamed from: tb.wdj$b$b  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class C1087b extends ucj {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C1087b() {
            }

            public static /* synthetic */ Object ipc$super(C1087b bVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taopai2/material/business/res/MusicResRequester$2$2");
            }

            @Override // tb.e8i
            public File r(String str, int i, String str2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (File) ipChange.ipc$dispatch("5b06d219", new Object[]{this, str, new Integer(i), str2});
                }
                MusicItemBean musicItemBean = b.this.d;
                return ucj.J(musicItemBean.id, musicItemBean.audioId);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class c implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f30638a;
            public final /* synthetic */ String b;

            public c(String str, String str2) {
                this.f30638a = str;
                this.b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    wdj.d(wdj.this).onFail(this.f30638a, this.b);
                }
            }
        }

        public b(e[] eVarArr, MusicResource musicResource, boolean z, MusicItemBean musicItemBean) {
            this.f30636a = eVarArr;
            this.b = musicResource;
            this.c = z;
            this.d = musicItemBean;
        }

        @Override // tb.crc
        public void a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6558de82", new Object[]{this, str, str2, str3});
                return;
            }
            this.f30636a[0].f30640a = 3;
            ovu.b(new c(str2, str3));
        }

        @Override // tb.crc
        public void b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b538f3f", new Object[]{this, str, str2});
                return;
            }
            e[] eVarArr = this.f30636a;
            eVarArr[0].f30640a = 2;
            MusicResource musicResource = this.b;
            musicResource.musicPath = str2;
            if (this.c) {
                c();
            } else {
                wdj.c(wdj.this, eVarArr, musicResource);
            }
        }

        public final void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899bdac4", new Object[]{this});
                return;
            }
            MusicItemBean musicItemBean = this.d;
            File J = ucj.J(musicItemBean.id, musicItemBean.audioId);
            if (J == null || !J.exists()) {
                MusicItemBean musicItemBean2 = this.d;
                m6o m6oVar = new m6o(new u8i(3, 0, musicItemBean2.id, musicItemBean2.waveformUrl), new a());
                m6oVar.j(false);
                m6oVar.k(new C1087b());
                m6oVar.e();
                return;
            }
            this.f30636a[1].f30640a = 2;
            this.b.musicWavePath = J.getAbsolutePath();
            wdj.c(wdj.this, this.f30636a, this.b);
        }

        @Override // tb.crc
        public void onProgress(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("947093e6", new Object[]{this, str, new Integer(i)});
            } else {
                this.f30636a[0].getClass();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c extends ucj {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ MusicItemBean k;

        public c(wdj wdjVar, MusicItemBean musicItemBean) {
            this.k = musicItemBean;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taopai2/material/business/res/MusicResRequester$3");
        }

        @Override // tb.e8i
        public File r(String str, int i, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (File) ipChange.ipc$dispatch("5b06d219", new Object[]{this, str, new Integer(i), str2});
            }
            MusicItemBean musicItemBean = this.k;
            return ucj.I(musicItemBean.id, musicItemBean.audioId);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MusicResource f30639a;

        public d(MusicResource musicResource) {
            this.f30639a = musicResource;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                wdj.d(wdj.this).onSuccess(this.f30639a);
            }
        }
    }

    static {
        t2o.a(782237896);
    }

    public wdj(String str, String str2, int i, String str3, MaterialDataServer materialDataServer, frc frcVar) {
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = i;
        this.f30634a = materialDataServer;
        this.b = frcVar;
    }

    public static /* synthetic */ void c(wdj wdjVar, e[] eVarArr, MusicResource musicResource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4324a743", new Object[]{wdjVar, eVarArr, musicResource});
        } else {
            wdjVar.e(eVarArr, musicResource);
        }
    }

    public static /* synthetic */ frc d(wdj wdjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (frc) ipChange.ipc$dispatch("bd5f2c37", new Object[]{wdjVar});
        }
        return wdjVar.b;
    }

    public static final MusicResource f(MusicItemBean musicItemBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MusicResource) ipChange.ipc$dispatch("76c9f9bb", new Object[]{musicItemBean});
        }
        MusicResource musicResource = new MusicResource();
        musicResource.id = musicItemBean.id;
        musicResource.audioId = musicItemBean.audioId;
        musicResource.soundId = musicItemBean.soundId;
        musicResource.artists = musicItemBean.artists;
        musicResource.duration = musicItemBean.duration;
        musicResource.liked = musicItemBean.liked;
        musicResource.logoUrl = musicItemBean.logoUrl;
        musicResource.name = musicItemBean.name;
        musicResource.vendorType = musicItemBean.vendorType;
        musicResource.filePath = musicItemBean.filePath;
        musicResource.downloadUrl = musicItemBean.downloadUrl;
        musicResource.listenUrl = musicItemBean.listenUrl;
        musicResource.subName = musicItemBean.subName;
        musicResource.waveformUrl = musicItemBean.waveformUrl;
        musicResource.refrainStartTime = musicItemBean.refrainStartTime;
        musicResource.refrainEndTime = musicItemBean.refrainEndTime;
        musicResource.directUseRefrain = musicItemBean.directUseRefrain;
        musicResource.refrainSource = musicItemBean.refrainSource;
        return musicResource;
    }

    public final void e(e[] eVarArr, MusicResource musicResource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("250aae42", new Object[]{this, eVarArr, musicResource});
            return;
        }
        boolean z = true;
        for (e eVar : eVarArr) {
            z &= i(eVar);
        }
        if (z) {
            ovu.b(new d(musicResource));
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("912bda12", new Object[]{this});
        } else {
            this.f30634a.m(this.c, this.d, this.e, this.f).subscribe(new mk4() { // from class: tb.udj
                public final void accept(Object obj) {
                    wdj.this.j((MusicItemBean) obj);
                }
            }, new mk4() { // from class: tb.vdj
                public final void accept(Object obj) {
                    wdj.this.k((Throwable) obj);
                }
            });
        }
    }

    public final void h(MusicItemBean musicItemBean, MusicResource musicResource, boolean z, e[] eVarArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d414bb01", new Object[]{this, musicItemBean, musicResource, new Boolean(z), eVarArr});
            return;
        }
        b bVar = new b(eVarArr, musicResource, z, musicItemBean);
        File I = ucj.I(musicItemBean.id, musicItemBean.audioId);
        if (I == null || !I.exists()) {
            m6o m6oVar = new m6o(new u8i(3, 0, musicItemBean.id, musicItemBean.listenUrl), bVar);
            eVarArr[0].f30640a = 1;
            m6oVar.k(new c(this, musicItemBean));
            m6oVar.e();
            return;
        }
        bVar.b(musicItemBean.id, I.getAbsolutePath());
    }

    public final boolean i(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d757a96", new Object[]{this, eVar})).booleanValue();
        }
        int i = eVar.f30640a;
        if (i == 2 || i == 3) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void j(MusicItemBean musicItemBean) throws Exception {
        e[] eVarArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d0099d2", new Object[]{this, musicItemBean});
            return;
        }
        MusicResource f = f(musicItemBean);
        boolean isEmpty = TextUtils.isEmpty(musicItemBean.waveformUrl);
        boolean z = !isEmpty;
        if (!isEmpty) {
            eVarArr = new e[2];
        } else {
            eVarArr = new e[1];
        }
        for (int i = 0; i < eVarArr.length; i++) {
            eVarArr[i] = new e(null);
        }
        h(musicItemBean, f, z, eVarArr);
    }

    public final /* synthetic */ void k(Throwable th) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecc3c57a", new Object[]{this, th});
        } else {
            ovu.b(new a(th));
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        try {
            g();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public int f30640a;

        static {
            t2o.a(782237904);
        }

        public e() {
            this.f30640a = 0;
        }

        public /* synthetic */ e(a aVar) {
            this();
        }
    }
}
