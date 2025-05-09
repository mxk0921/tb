package com.taobao.taopai.material.request.materialfile;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai.material.bean.funny.bean.FunnyBean;
import com.taobao.taopai.material.bean.funny.bean.FunnyDecorationBean;
import com.taobao.taopai.material.bean.funny.bean.FunnyResourceBean;
import com.taobao.taopai.material.request.base.BaseMaterialBusiness;
import com.taobao.taopai.material.request.materialfile.MaterialFileBusiness;
import java.io.File;
import java.util.List;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bct;
import tb.crc;
import tb.dai;
import tb.e8i;
import tb.ovu;
import tb.pjd;
import tb.t2o;
import tb.t8i;
import tb.u8i;
import tb.uf9;
import tb.y9i;
import tb.zpc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class MaterialFileBusiness extends BaseMaterialBusiness<String> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String REQUIRE_JSON = "require.json";
    private static final String TAG = "MaterialFileBusiness";
    private static final String TEMPLATE_JSON = "template.json";
    private Context mContext;
    private e8i mDownloadTask;
    private u8i mFileParams;
    private crc mListener;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements pjd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ crc f13373a;
        public final /* synthetic */ u8i b;

        public a(crc crcVar, u8i u8iVar) {
            this.f13373a = crcVar;
            this.b = u8iVar;
        }

        @Override // tb.pjd
        public void onFail(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2f5f2b8", new Object[]{this, str, str2});
            } else {
                this.f13373a.a(this.b.n(), str, str2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements crc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.crc
        public void a(final String str, final String str2, final String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6558de82", new Object[]{this, str, str2, str3});
                return;
            }
            y9i.b().e(MaterialFileBusiness.access$000(MaterialFileBusiness.this).n());
            ovu.b(new Runnable() { // from class: tb.p8i
                @Override // java.lang.Runnable
                public final void run() {
                    MaterialFileBusiness.b.this.f(str, str2, str3);
                }
            });
            Log.e("TPMaterial", "MaterialFile Fail From Net , tid = " + MaterialFileBusiness.access$000(MaterialFileBusiness.this).n());
        }

        @Override // tb.crc
        public void b(final String str, final String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b538f3f", new Object[]{this, str, str2});
                return;
            }
            MaterialFileBusiness.access$000(MaterialFileBusiness.this).n();
            y9i.b().e(MaterialFileBusiness.access$000(MaterialFileBusiness.this).n());
            if (!bct.e() || MaterialFileBusiness.access$100(MaterialFileBusiness.this) == null) {
                ovu.b(new Runnable() { // from class: tb.n8i
                    @Override // java.lang.Runnable
                    public final void run() {
                        MaterialFileBusiness.b.this.h(str, str2);
                    }
                });
            } else {
                MaterialFileBusiness.access$200(MaterialFileBusiness.this, str, str2);
            }
        }

        public final /* synthetic */ void f(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1738856a", new Object[]{this, str, str2, str3});
            } else {
                MaterialFileBusiness.access$300(MaterialFileBusiness.this).a(str, str2, str3);
            }
        }

        public final /* synthetic */ void g(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a54d3dd", new Object[]{this, str, new Integer(i)});
            } else {
                MaterialFileBusiness.access$300(MaterialFileBusiness.this).onProgress(str, i);
            }
        }

        public final /* synthetic */ void h(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("791648fc", new Object[]{this, str, str2});
            } else {
                MaterialFileBusiness.access$300(MaterialFileBusiness.this).b(str, str2);
            }
        }

        @Override // tb.crc
        public void onProgress(final String str, final int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("947093e6", new Object[]{this, str, new Integer(i)});
            } else {
                ovu.b(new Runnable() { // from class: tb.o8i
                    @Override // java.lang.Runnable
                    public final void run() {
                        MaterialFileBusiness.b.this.g(str, i);
                    }
                });
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements zpc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13375a;
        public final /* synthetic */ String b;

        public c(String str, String str2) {
            this.f13375a = str;
            this.b = str2;
        }

        @Override // tb.zpc
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1f22b854", new Object[]{this});
                return;
            }
            final String str = this.f13375a;
            final String str2 = this.b;
            ovu.b(new Runnable() { // from class: tb.r8i
                @Override // java.lang.Runnable
                public final void run() {
                    MaterialFileBusiness.c.this.f(str, str2);
                }
            });
        }

        @Override // tb.zpc
        public void b(final int i, final String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("364ea92", new Object[]{this, new Integer(i), str});
                return;
            }
            final String str2 = this.f13375a;
            ovu.b(new Runnable() { // from class: tb.q8i
                @Override // java.lang.Runnable
                public final void run() {
                    MaterialFileBusiness.c.this.e(str2, i, str);
                }
            });
            Log.e(MaterialFileBusiness.TAG, "onMaiResDependFail " + i + " , msg = " + str);
        }

        public final /* synthetic */ void e(String str, int i, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3ab57aac", new Object[]{this, str, new Integer(i), str2});
            } else {
                MaterialFileBusiness.access$300(MaterialFileBusiness.this).a(str, String.valueOf(i), str2);
            }
        }

        public final /* synthetic */ void f(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d2727ccb", new Object[]{this, str, str2});
            } else {
                MaterialFileBusiness.access$300(MaterialFileBusiness.this).b(str, str2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13376a;
        public final /* synthetic */ zpc b;
        public final /* synthetic */ String c;

        public d(String str, zpc zpcVar, String str2) {
            this.f13376a = str;
            this.b = zpcVar;
            this.c = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void b(zpc zpcVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fc16c134", new Object[]{zpcVar});
            } else {
                zpcVar.a();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                MaterialFileBusiness.access$400(MaterialFileBusiness.this, this.f13376a, this.b, this.c);
            } catch (Exception e) {
                e.printStackTrace();
                final zpc zpcVar = this.b;
                ovu.b(new Runnable() { // from class: tb.s8i
                    @Override // java.lang.Runnable
                    public final void run() {
                        MaterialFileBusiness.d.b(zpc.this);
                    }
                });
            }
        }
    }

    static {
        t2o.a(782237807);
    }

    public MaterialFileBusiness(Context context, u8i u8iVar, crc crcVar) {
        super(u8iVar, new a(crcVar, u8iVar));
        this.mContext = context;
        this.mFileParams = u8iVar;
        this.mListener = crcVar;
    }

    public static /* synthetic */ u8i access$000(MaterialFileBusiness materialFileBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u8i) ipChange.ipc$dispatch("cf68cab9", new Object[]{materialFileBusiness});
        }
        return materialFileBusiness.mFileParams;
    }

    public static /* synthetic */ Context access$100(MaterialFileBusiness materialFileBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("fbf2cc92", new Object[]{materialFileBusiness});
        }
        return materialFileBusiness.mContext;
    }

    public static /* synthetic */ void access$200(MaterialFileBusiness materialFileBusiness, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb591daf", new Object[]{materialFileBusiness, str, str2});
        } else {
            materialFileBusiness.checkMaiDependDownload(str, str2);
        }
    }

    public static /* synthetic */ crc access$300(MaterialFileBusiness materialFileBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (crc) ipChange.ipc$dispatch("d42988f7", new Object[]{materialFileBusiness});
        }
        return materialFileBusiness.mListener;
    }

    public static /* synthetic */ void access$400(MaterialFileBusiness materialFileBusiness, String str, zpc zpcVar, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccf33052", new Object[]{materialFileBusiness, str, zpcVar, str2});
        } else {
            materialFileBusiness.parseFunnyFile(str, zpcVar, str2);
        }
    }

    private void checkMaiDependDownload(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d45a8bc", new Object[]{this, str, str2});
        } else {
            handleMaiDepend(str2, new c(str, str2));
        }
    }

    private void handleMaiDepend(String str, zpc zpcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29b2fce5", new Object[]{this, str, zpcVar});
        } else if (TextUtils.isEmpty(str)) {
            zpcVar.a();
        } else {
            String i = uf9.i(str + File.separator + TEMPLATE_JSON);
            if (!TextUtils.isEmpty(i)) {
                AsyncTask.THREAD_POOL_EXECUTOR.execute(new d(str, zpcVar, i));
            } else {
                zpcVar.a();
            }
        }
    }

    public static /* synthetic */ Object ipc$super(MaterialFileBusiness materialFileBusiness, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taopai/material/request/materialfile/MaterialFileBusiness");
    }

    private boolean isExistFile(File[] fileArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5dd8d0a", new Object[]{this, fileArr, str})).booleanValue();
        }
        for (File file : fileArr) {
            if (file.getName() != null && file.getName().endsWith(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getMaterialFile$58() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce321872", new Object[]{this});
        } else if (this.mFileParams.c()) {
            final String a2 = t8i.a(this.mFileParams.n(), this.mFileParams.p(), this.mFileParams.o());
            if (!TextUtils.isEmpty(this.mFileParams.j())) {
                a2 = a2 + File.separator + this.mFileParams.j();
            }
            if (!isCacheInvalid(a2)) {
                if (bct.e()) {
                    checkMaiDependDownload(this.mFileParams.n(), a2);
                } else {
                    ovu.b(new Runnable() { // from class: tb.j8i
                        @Override // java.lang.Runnable
                        public final void run() {
                            MaterialFileBusiness.this.lambda$null$55(a2);
                        }
                    });
                }
                dai.f(this.mFileParams.a(), getUtRequestKey());
                this.mFileParams.n();
                return;
            }
            ovu.b(new Runnable() { // from class: tb.k8i
                @Override // java.lang.Runnable
                public final void run() {
                    MaterialFileBusiness.this.lambda$null$56();
                }
            });
        } else {
            ovu.b(new Runnable() { // from class: tb.l8i
                @Override // java.lang.Runnable
                public final void run() {
                    MaterialFileBusiness.this.lambda$null$57();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$null$55(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2939ed91", new Object[]{this, str});
        } else {
            this.mListener.b(this.mFileParams.n(), str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$null$56() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bd90f08", new Object[]{this});
        } else {
            requestByNet();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$null$57() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6be72689", new Object[]{this});
        } else {
            requestByNet();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$parseFunnyFile$65(zpc zpcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd16d1d5", new Object[]{zpcVar});
        } else {
            zpcVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$parseFunnyFile$66(zpc zpcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51554174", new Object[]{zpcVar});
        } else {
            zpcVar.a();
        }
    }

    private void parseFunnyFile(String str, final zpc zpcVar, String str2) {
        FunnyResourceBean funnyResourceBean;
        List<FunnyDecorationBean> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ae612d5", new Object[]{this, str, zpcVar, str2});
            return;
        }
        FunnyBean funnyBean = (FunnyBean) JSON.parseObject(str2, FunnyBean.class);
        if (!(funnyBean == null || (funnyResourceBean = funnyBean.stage) == null || (list = funnyResourceBean.decorators) == null || list.isEmpty())) {
            for (FunnyDecorationBean funnyDecorationBean : funnyBean.stage.decorators) {
                if (TextUtils.equals(funnyDecorationBean.type, "2")) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    String str3 = File.separator;
                    sb.append(str3);
                    sb.append(funnyDecorationBean.resourcePath);
                    sb.append(str3);
                    sb.append(REQUIRE_JSON);
                    String sb2 = sb.toString();
                    if (new File(sb2).exists()) {
                        new com.taobao.taopai.material.maires.a(this.mContext).m(this.mFileParams.a(), sb2, 30, zpcVar);
                        return;
                    } else {
                        ovu.b(new Runnable() { // from class: tb.h8i
                            @Override // java.lang.Runnable
                            public final void run() {
                                MaterialFileBusiness.lambda$parseFunnyFile$65(zpc.this);
                            }
                        });
                        return;
                    }
                }
            }
        }
        ovu.b(new Runnable() { // from class: tb.i8i
            @Override // java.lang.Runnable
            public final void run() {
                MaterialFileBusiness.lambda$parseFunnyFile$66(zpc.this);
            }
        });
    }

    private void requestByNet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c72017e", new Object[]{this});
            return;
        }
        e8i e8iVar = new e8i(this.mFileParams.m(), new b());
        this.mDownloadTask = e8iVar;
        e8iVar.C(this.mFileParams.a(), this.mFileParams.n(), this.mFileParams.o(), this.mFileParams.p(), this.mFileParams.j());
    }

    @Override // com.taobao.taopai.material.request.base.BaseMaterialBusiness
    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        e8i e8iVar = this.mDownloadTask;
        if (e8iVar != null) {
            e8iVar.o();
            this.mDownloadTask.n();
        }
    }

    @Override // com.taobao.taopai.material.request.base.BaseMaterialBusiness
    public String getCacheFilePath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d638f6c", new Object[]{this});
        }
        return null;
    }

    public void getMaterialFile() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4d475c0", new Object[]{this});
        } else {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: tb.m8i
                @Override // java.lang.Runnable
                public final void run() {
                    MaterialFileBusiness.this.lambda$getMaterialFile$58();
                }
            });
        }
    }

    @Override // com.taobao.taopai.material.request.base.BaseMaterialBusiness
    public String getUtRequestKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8a583454", new Object[]{this});
        }
        return "file";
    }

    public void handleCacheLoaded(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42c2c30", new Object[]{this, str});
        }
    }

    @Override // com.taobao.taopai.material.request.base.BaseMaterialBusiness, com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
        }
    }

    @Override // com.taobao.taopai.material.request.base.BaseMaterialBusiness, com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
        }
    }

    @Override // com.taobao.taopai.material.request.base.BaseMaterialBusiness, com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
        }
    }

    @Override // com.taobao.taopai.material.request.base.BaseMaterialBusiness
    public String parseCacheData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("27955b36", new Object[]{this, str});
        }
        return null;
    }

    @Override // com.taobao.taopai.material.request.base.BaseMaterialBusiness
    public void requestNet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff1c8e15", new Object[]{this});
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a4, code lost:
        if (r8[0].getName().endsWith(tb.ztl.c()) != false) goto L_0x00a6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean isCacheInvalid(java.lang.String r8) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.taopai.material.request.materialfile.MaterialFileBusiness.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001c
            java.lang.String r3 = "50434fb4"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r7
            r4[r0] = r8
            java.lang.Object r8 = r2.ipc$dispatch(r3, r4)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            return r8
        L_0x001c:
            tb.y9i r2 = tb.y9i.b()
            tb.u8i r3 = r7.mFileParams
            java.lang.String r3 = r3.n()
            boolean r2 = r2.d(r3)
            if (r2 == 0) goto L_0x002d
            return r0
        L_0x002d:
            boolean r2 = android.text.TextUtils.isEmpty(r8)
            if (r2 == 0) goto L_0x0034
            return r0
        L_0x0034:
            tb.u8i r2 = r7.mFileParams
            java.lang.String r2 = r2.o()
            tb.u8i r3 = r7.mFileParams
            java.lang.String r3 = r3.n()
            tb.u8i r4 = r7.mFileParams
            int r4 = r4.p()
            tb.u8i r5 = r7.mFileParams
            long r5 = r5.l()
            boolean r2 = tb.t8i.h(r2, r3, r4, r5)
            if (r2 != 0) goto L_0x0053
            return r0
        L_0x0053:
            java.io.File r2 = new java.io.File
            r2.<init>(r8)
            tb.u8i r8 = r7.mFileParams
            java.lang.String r8 = r8.j()
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 == 0) goto L_0x00a7
            java.io.File[] r8 = r2.listFiles()
            if (r8 == 0) goto L_0x00a6
            int r3 = r8.length
            if (r3 != 0) goto L_0x006e
            goto L_0x00a6
        L_0x006e:
            tb.u8i r3 = r7.mFileParams
            java.lang.String r3 = r3.s()
            tb.u8i r4 = r7.mFileParams
            int r4 = r4.m()
            r5 = 7
            if (r4 != r5) goto L_0x0086
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L_0x0086
            java.lang.String r3 = "marvel.json"
        L_0x0086:
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x0093
            boolean r8 = r7.isExistFile(r8, r3)
            if (r8 != 0) goto L_0x00b8
            return r0
        L_0x0093:
            int r3 = r8.length
            if (r3 != r0) goto L_0x00b8
            r8 = r8[r1]
            java.lang.String r8 = r8.getName()
            java.lang.String r3 = tb.ztl.c()
            boolean r8 = r8.endsWith(r3)
            if (r8 == 0) goto L_0x00b8
        L_0x00a6:
            return r0
        L_0x00a7:
            java.lang.String r8 = r2.getPath()
            tb.u8i r3 = r7.mFileParams
            java.lang.String r3 = r3.j()
            boolean r8 = r8.endsWith(r3)
            if (r8 != 0) goto L_0x00b8
            return r0
        L_0x00b8:
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = r2.lastModified()
            long r3 = r3 - r5
            long r5 = r7.getCacheTime()
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 <= 0) goto L_0x00ca
            goto L_0x00cb
        L_0x00ca:
            r0 = 0
        L_0x00cb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taopai.material.request.materialfile.MaterialFileBusiness.isCacheInvalid(java.lang.String):boolean");
    }
}
