package com.taobao.android.litecreator.modules.template;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.marvel.Marvel;
import com.alibaba.marvel.Project;
import com.alibaba.marvel.TemplateEditor;
import com.alibaba.marvel.exporter.DraftExporter;
import com.alibaba.marvel.exporter.ImageExporter;
import com.alibaba.marvel.java.OnCompleteListener;
import com.alibaba.marvel.java.OnErrorListener;
import com.alibaba.marvel.java.ResourceInspector;
import com.alibaba.marvel.java.TemplateSelector;
import com.alibaba.marvel.java.TemplateTag;
import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.Constant;
import com.taobao.android.litecreator.modules.template.UserAvatarRequester;
import com.taobao.android.litecreator.modules.template.b;
import com.taobao.tao.Globals;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.cg9;
import tb.ed2;
import tb.i8g;
import tb.odg;
import tb.q2s;
import tb.t2o;
import tb.tp6;
import tb.trt;
import tb.vzd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "LcTemplateModel";

    /* renamed from: a  reason: collision with root package name */
    public final com.taobao.android.litecreator.modules.template.b f8295a = new com.taobao.android.litecreator.modules.template.b();

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.litecreator.modules.template.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class C0438a implements ResourceInspector {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f8296a;
        public final /* synthetic */ Context b;

        public C0438a(String str, Context context) {
            this.f8296a = str;
            this.b = context;
        }

        public ResourceInspector.Ret onResourceInspect(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ResourceInspector.Ret) ipChange.ipc$dispatch("bea897c0", new Object[]{this, map});
            }
            String str = this.f8296a;
            if (str != null && str.endsWith("marvel.json")) {
                a.a(a.this).d(this.b, this.f8296a.substring(0, this.f8296a.lastIndexOf("/")), map);
            }
            return ResourceInspector.Ret.Pass;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements b.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TemplateInfo f8297a;
        public final /* synthetic */ List b;
        public final /* synthetic */ vzd c;

        public b(TemplateInfo templateInfo, List list, vzd vzdVar) {
            this.f8297a = templateInfo;
            this.b = list;
            this.c = vzdVar;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd42bfa4", new Object[]{this});
            } else {
                a.b(a.this, this.f8297a, this.b, this.c);
            }
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
            } else {
                a.b(a.this, this.f8297a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements UserAvatarRequester.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TemplateInfo f8298a;
        public final /* synthetic */ List b;
        public final /* synthetic */ vzd c;

        public c(TemplateInfo templateInfo, List list, vzd vzdVar) {
            this.f8298a = templateInfo;
            this.b = list;
            this.c = vzdVar;
        }

        @Override // com.taobao.android.litecreator.modules.template.UserAvatarRequester.b
        public void onFail(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2f5f2b8", new Object[]{this, str, str2});
            } else {
                a.b(a.this, this.f8298a, this.b, this.c);
            }
        }

        @Override // com.taobao.android.litecreator.modules.template.UserAvatarRequester.b
        public void onSuccess(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("37d948b5", new Object[]{this, str});
            } else {
                a.b(a.this, this.f8298a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements tp6<String> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Project f8303a;
        public final /* synthetic */ vzd b;

        public f(Project project, vzd vzdVar) {
            this.f8303a = project;
            this.b = vzdVar;
        }

        /* renamed from: b */
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb3b1395", new Object[]{this, str});
                return;
            }
            odg.c(a.TAG, "exportDraft onReceive: null ");
            a.d(a.this, this.f8303a);
            this.b.a(new TemplateResult("guideMarvelExport", Constant.CODE_ERROR_OPERATOR_UNKNOWN_FAIL, "draftExportFailed"), "", "draftExportFailed");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class g implements OnCompleteListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ tp6 f8304a;
        public final /* synthetic */ String b;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.litecreator.modules.template.a$g$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class RunnableC0441a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0441a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                g gVar = g.this;
                gVar.f8304a.a(gVar.b);
            }
        }

        public g(a aVar, tp6 tp6Var, String str) {
            this.f8304a = tp6Var;
            this.b = str;
        }

        public void onComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
            } else {
                trt.h(new RunnableC0441a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class h implements OnErrorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ tp6 f8306a;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.litecreator.modules.template.a$h$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class RunnableC0442a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0442a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    h.this.f8306a.a(null);
                }
            }
        }

        public h(a aVar, tp6 tp6Var) {
            this.f8306a = tp6Var;
        }

        public void onError(String str, String str2, int i, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9c8c7f09", new Object[]{this, str, str2, new Integer(i), str3});
            } else {
                trt.h(new RunnableC0442a());
            }
        }
    }

    static {
        t2o.a(511705279);
    }

    public static /* synthetic */ com.taobao.android.litecreator.modules.template.b a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.litecreator.modules.template.b) ipChange.ipc$dispatch("944d380", new Object[]{aVar});
        }
        return aVar.f8295a;
    }

    public static /* synthetic */ void b(a aVar, TemplateInfo templateInfo, List list, vzd vzdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f31c63d", new Object[]{aVar, templateInfo, list, vzdVar});
        } else {
            aVar.j(templateInfo, list, vzdVar);
        }
    }

    public static /* synthetic */ void c(a aVar, TemplateInfo templateInfo, Project project, TemplateResult templateResult, vzd vzdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a4defb", new Object[]{aVar, templateInfo, project, templateResult, vzdVar});
        } else {
            aVar.m(templateInfo, project, templateResult, vzdVar);
        }
    }

    public static /* synthetic */ void d(a aVar, Project project) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cce209d", new Object[]{aVar, project});
        } else {
            aVar.k(project);
        }
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c4d95d1", new Object[]{this, str});
        } else {
            this.f8295a.c(str);
        }
    }

    public final void f(TemplateInfo templateInfo, Project project, tp6<String> tp6Var, tp6<String> tp6Var2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f69c9d7", new Object[]{this, templateInfo, project, tp6Var, tp6Var2});
            return;
        }
        String str = templateInfo.templateRootPath + "/" + project.hashCode() + "/" + System.currentTimeMillis() + q2s.JSON;
        DraftExporter draftExporter = new DraftExporter();
        draftExporter.setOutputPath(str);
        draftExporter.setOnCompleteListener(new g(this, tp6Var, str));
        draftExporter.setOnErrorListener(new h(this, tp6Var2));
        project.export(draftExporter);
    }

    public TemplateSelector g(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateSelector) ipChange.ipc$dispatch("11d752dc", new Object[]{this, context, str});
        }
        return h(context, str + "/marvel.json", str + "/meta.json");
    }

    public boolean i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8095872f", new Object[]{this, str})).booleanValue();
        }
        return this.f8295a.g(str);
    }

    public final void k(Project project) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1d54c33", new Object[]{this, project});
        } else {
            project.destroy();
        }
    }

    public final void m(TemplateInfo templateInfo, Project project, TemplateResult templateResult, vzd vzdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65297d7b", new Object[]{this, templateInfo, project, templateResult, vzdVar});
        } else {
            f(templateInfo, project, new e(SystemClock.elapsedRealtime(), templateInfo, templateResult, project, vzdVar), new f(project, vzdVar));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements ImageExporter.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ vzd f8299a;
        public final /* synthetic */ TemplateInfo b;
        public final /* synthetic */ TemplateResult c;
        public final /* synthetic */ String d;
        public final /* synthetic */ long e;
        public final /* synthetic */ Project f;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.litecreator.modules.template.a$d$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class RunnableC0439a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0439a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                d dVar = d.this;
                a.c(a.this, dVar.b, dVar.f, dVar.c, dVar.f8299a);
            }
        }

        public d(vzd vzdVar, TemplateInfo templateInfo, TemplateResult templateResult, String str, long j, Project project) {
            this.f8299a = vzdVar;
            this.b = templateInfo;
            this.c = templateResult;
            this.d = str;
            this.e = j;
            this.f = project;
        }

        public void a(long j, int i, int i2, int i3, int i4, ByteBuffer byteBuffer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b1d61e62", new Object[]{this, new Long(j), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), byteBuffer});
                return;
            }
            Bitmap createBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
            createBitmap.copyPixelsFromBuffer(byteBuffer);
            String e = i8g.e(Globals.getApplication());
            if (!ed2.q(createBitmap, e)) {
                this.f8299a.a(new TemplateResult("guideMarvelExport", Constant.CODE_ERROR_NO_MOBILE_NETWORK_FAIL, "marvelExportFailed"), "", "save bitmap fail");
                return;
            }
            this.b.templateResultFile = e;
            TemplateResult templateResult = this.c;
            templateResult.resultPath = e;
            templateResult.metaJsonPath = this.d;
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.e;
            odg.d(a.TAG, "onFrame: 合成时间=" + elapsedRealtime);
            trt.c(new RunnableC0439a());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements tp6<String> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f8301a;
        public final /* synthetic */ TemplateInfo b;
        public final /* synthetic */ TemplateResult c;
        public final /* synthetic */ Project d;
        public final /* synthetic */ vzd e;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.litecreator.modules.template.a$e$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class RunnableC0440a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0440a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                e eVar = e.this;
                vzd vzdVar = eVar.e;
                if (vzdVar != null) {
                    vzdVar.b(eVar.c);
                }
            }
        }

        public e(long j, TemplateInfo templateInfo, TemplateResult templateResult, Project project, vzd vzdVar) {
            this.f8301a = j;
            this.b = templateInfo;
            this.c = templateResult;
            this.d = project;
            this.e = vzdVar;
        }

        /* renamed from: b */
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb3b1395", new Object[]{this, str});
                return;
            }
            odg.d(a.TAG, "合成后的exportDraft=> " + str);
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f8301a;
            odg.d(a.TAG, "onFrame: 草稿时间=" + elapsedRealtime);
            TemplateInfo templateInfo = this.b;
            templateInfo.templateDraftFile = str;
            TemplateResult templateResult = this.c;
            templateResult.draftPath = str;
            templateInfo.result = templateResult;
            templateInfo.exportState = "finish";
            a.d(a.this, this.d);
            trt.c(new RunnableC0440a());
        }
    }

    public TemplateSelector h(Context context, String str, String str2) {
        int i;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateSelector) ipChange.ipc$dispatch("320394d2", new Object[]{this, context, str, str2});
        }
        Project createProject = Marvel.createProject();
        boolean load = createProject.load(str, new C0438a(str, context));
        odg.c(TAG, "startExport: loadMarvelResult=" + load);
        if (!load) {
            return null;
        }
        TemplateEditor templateEditor = new TemplateEditor(createProject.getApp());
        templateEditor.setProject(createProject);
        File file = new File(str2);
        if (file.exists()) {
            i = createProject.loadTemplateMetaInfo(file.getPath());
            z = true;
        } else {
            i = -100;
            z = false;
        }
        odg.c(TAG, "startExport: resultCode=" + i);
        if (!z || i != 0) {
            return null;
        }
        TemplateSelector selectorTags = templateEditor.getSelectorTags("mediasPlaceHolders");
        createProject.destroy();
        return selectorTags;
    }

    public void l(Context context, TemplateInfo templateInfo, List<String> list, vzd vzdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2381f6ec", new Object[]{this, context, templateInfo, list, vzdVar});
            return;
        }
        odg.c(TAG, "export: itemId=" + templateInfo.itemId);
        if (TextUtils.isEmpty(templateInfo.templateRootPath) || !cg9.l(templateInfo.templateRootPath)) {
            vzdVar.a(new TemplateResult("guideMarvelExport", Constant.CODE_ERROR_PHONE_UNSAFE_FAIL, "marvelJsonDirNotExist"), "", "templateRootPath null!");
        } else if (this.f8295a.g(templateInfo.templateRootPath)) {
            this.f8295a.k(context, new b(templateInfo, list, vzdVar));
        } else if (this.f8295a.h()) {
            this.f8295a.i(context, new c(templateInfo, list, vzdVar));
        } else {
            j(templateInfo, list, vzdVar);
        }
    }

    public final void j(TemplateInfo templateInfo, List<String> list, vzd vzdVar) {
        boolean z;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b072218", new Object[]{this, templateInfo, list, vzdVar});
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String str = templateInfo.templateRootPath;
        String str2 = str + "/marvel.json";
        String str3 = str + "/meta.json";
        Project createProject = Marvel.createProject();
        boolean load = createProject.load(str2, (ResourceInspector) null);
        odg.c(TAG, "startExport: curProject.load isOK=" + load);
        if (!load) {
            vzdVar.a(new TemplateResult("guideMarvelExport", Constant.CODE_ERROR_GET_CONFIG_FAIL, "marvelLoadMarvelJsonFailed"), "", "curProject loadResult fail!");
            return;
        }
        TemplateEditor templateEditor = new TemplateEditor(createProject.getApp());
        templateEditor.setProject(createProject);
        File file = new File(str3);
        if (file.exists()) {
            i = createProject.loadTemplateMetaInfo(file.getPath());
            z = true;
        } else {
            i = -100;
            z = false;
        }
        odg.c(TAG, "startExport: metaLoadResult=" + i);
        if (!z) {
            vzdVar.a(new TemplateResult("guideMarvelExport", Constant.CODE_ERROR_NO_SIM_FAIL, "metaJsonNotExist"), "", "curProject meta json loadResult fail!");
        } else if (i != 0) {
            vzdVar.a(new TemplateResult("guideMarvelExport", Constant.CODE_ERROR_NO_PERMISSION_FAIL, "metaJsonLoadMarvelJsonFailed"), "", "curProject meta json loadResult fail!");
        } else {
            TemplateSelector selectorTags = templateEditor.getSelectorTags("mediasPlaceHolders");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = selectorTags.tags.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(Long.valueOf(((TemplateTag) selectorTags.tags.get(i2)).id));
                arrayList2.add(list.get(i2 % list.size()));
            }
            templateEditor.replacePlaceHolders(arrayList, arrayList2, 0L);
            TemplateResult templateResult = new TemplateResult();
            templateResult.itemId = templateInfo.itemId;
            ImageExporter imageExporter = new ImageExporter();
            imageExporter.setWidth(createProject.getMeEditor().getCanvasWidth());
            imageExporter.setHeight(createProject.getMeEditor().getCanvasHeight());
            imageExporter.setBitmapListener(new d(vzdVar, templateInfo, templateResult, str3, elapsedRealtime, createProject));
            createProject.export(imageExporter);
        }
    }
}
