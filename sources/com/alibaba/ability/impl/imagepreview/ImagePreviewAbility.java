package com.alibaba.ability.impl.imagepreview;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsImagePreviewAbility;
import com.taobao.android.abilityidl.ability.ImagePreviewCloseResult;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.megadesign.imagepreview.model.PreviewSourceModel;
import com.taobao.android.weex.config.WeexUnicornConfig;
import com.taobao.android.weex_framework.monitor.MUSMonitor;
import com.taobao.themis.external.embed.StartParams;
import com.taobao.themis.external.embed.TMSEmbed;
import com.taobao.themis.external.embed.TMSEmbedSolutionType;
import com.taobao.themis.external.embed.WebStartParams;
import com.taobao.themis.external.embed.Weex2StartParams;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import tb.a07;
import tb.c48;
import tb.ckf;
import tb.ep6;
import tb.gec;
import tb.hbl;
import tb.i04;
import tb.ic1;
import tb.jdb;
import tb.k1c;
import tb.kdb;
import tb.mne;
import tb.nce;
import tb.nne;
import tb.oce;
import tb.olq;
import tb.one;
import tb.p18;
import tb.pg1;
import tb.qne;
import tb.t2o;
import tb.tmu;
import tb.tne;
import tb.tsq;
import tb.vne;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ImagePreviewAbility extends AbsImagePreviewAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String IMAGE_PREVIEW_POP_ID = "mega_dark_image_preview";

    /* renamed from: a  reason: collision with root package name */
    public LocalBroadcastManager f1950a;
    public MyBroadCastReceiver b;
    public TMSEmbed c;
    public StartParams d;
    public c48 e;
    public BroadcastReceiver g;
    public Context h;
    public vne j;
    public final boolean f = hbl.d();
    public final List<PreviewSourceModel> i = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class MyBroadCastReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<ImagePreviewAbility> f1951a;
        public final gec b;

        static {
            t2o.a(110100485);
        }

        public MyBroadCastReceiver(gec gecVar, ImagePreviewAbility imagePreviewAbility) {
            ckf.g(gecVar, "callback");
            ckf.g(imagePreviewAbility, MUSMonitor.MODULE_DIM_ABILITY);
            this.b = gecVar;
            this.f1951a = new WeakReference<>(imagePreviewAbility);
        }

        public static /* synthetic */ Object ipc$super(MyBroadCastReceiver myBroadCastReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/imagepreview/ImagePreviewAbility$MyBroadCastReceiver");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent != null && ckf.b(ep6.ACTION_CLOSE, intent.getAction())) {
                ImagePreviewCloseResult imagePreviewCloseResult = new ImagePreviewCloseResult();
                imagePreviewCloseResult.type = intent.getStringExtra(ep6.ACTION_CLOSE_TYPE_PARAM);
                imagePreviewCloseResult.index = Integer.valueOf(intent.getIntExtra(ep6.ACTION_CLOSE_INDEX_PARAM, 0));
                this.b.u1(imagePreviewCloseResult);
                ImagePreviewAbility imagePreviewAbility = this.f1951a.get();
                if (imagePreviewAbility != null) {
                    imagePreviewAbility.release();
                }
                if (!hbl.a()) {
                    olq.a(context, ImagePreviewAbility.IMAGE_PREVIEW_POP_ID);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        static {
            t2o.a(110100483);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface b {
        void a(View view);

        void onError(String str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class c implements k1c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Context b;
        public final /* synthetic */ b c;
        public final /* synthetic */ JSONObject d;

        public c(String str, Context context, b bVar, JSONObject jSONObject) {
            this.b = context;
            this.c = bVar;
            this.d = jSONObject;
        }

        @Override // tb.k1c
        public void a(DXRootView dXRootView) {
            DXResult<DXRootView> dXResult;
            b bVar;
            DinamicXEngine h;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("be61b808", new Object[]{this, dXRootView});
                return;
            }
            ckf.g(dXRootView, "dxRootView");
            DXRenderOptions q = new DXRenderOptions.b().q();
            c48 access$getMDxViewWrapper$p = ImagePreviewAbility.access$getMDxViewWrapper$p(ImagePreviewAbility.this);
            DXRootView dXRootView2 = null;
            if (access$getMDxViewWrapper$p == null || (h = access$getMDxViewWrapper$p.h()) == null) {
                dXResult = null;
            } else {
                dXResult = h.i1(this.b, dXRootView, dXRootView.getDxTemplateItem(), new JSONObject(this.d), -1, q);
            }
            if (dXResult != null) {
                dXRootView2 = dXResult.f7291a;
            }
            if (dXRootView2 != null && !dXResult.d() && (bVar = this.c) != null) {
                bVar.a(dXResult.f7291a);
            }
        }

        @Override // tb.k1c
        public void b(String str, com.taobao.android.dinamicx.f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebb1f406", new Object[]{this, str, fVar});
                return;
            }
            ckf.g(str, "s");
            b bVar = this.c;
            if (bVar != null) {
                bVar.onError(str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class d extends TMSEmbed.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f1953a;

        public d(ImagePreviewAbility imagePreviewAbility, String str, Context context, b bVar, JSONObject jSONObject) {
            this.f1953a = bVar;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/imagepreview/ImagePreviewAbility$buildExtendsArea$$inlined$let$lambda$2");
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void l(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e972d0d", new Object[]{this, str, str2});
                return;
            }
            ckf.g(str, "errorCode");
            ckf.g(str2, "errorMsg");
            b bVar = this.f1953a;
            if (bVar != null) {
                bVar.onError(str2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class e implements oce {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f1954a;

        public e(ImagePreviewAbility imagePreviewAbility, String str, Context context, b bVar, JSONObject jSONObject) {
            this.f1954a = context;
        }

        @Override // tb.oce
        public void a(Map<String, ? extends Object> map) {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("267b7fce", new Object[]{this, map});
                return;
            }
            Object obj = null;
            Object obj2 = map != null ? map.get("state") : null;
            if (obj2 instanceof Boolean) {
                obj = obj2;
            }
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                z = bool.booleanValue();
            }
            Intent intent = new Intent("mega_dark_page_weex_gesture_event");
            intent.putExtra("weexGestureState", z);
            LocalBroadcastManager.getInstance(this.f1954a).sendBroadcast(intent);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class f implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ kdb b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ String d;

        public f(gec gecVar, kdb kdbVar, Context context, String str) {
            this.b = kdbVar;
            this.c = context;
            this.d = str;
        }

        @Override // com.alibaba.ability.impl.imagepreview.ImagePreviewAbility.b
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e6d2a8f", new Object[]{this, view});
            } else if (view != null) {
                ep6.d().q(this.d, view);
                LocalBroadcastManager.getInstance(this.c).sendBroadcast(new Intent("mega_dark_page_dx_extension_create"));
            }
        }

        @Override // com.alibaba.ability.impl.imagepreview.ImagePreviewAbility.b
        public void onError(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac367d3a", new Object[]{this, str});
                return;
            }
            ckf.g(str, "message");
            ImagePreviewAbility.access$sendRenderFailBroadcast(ImagePreviewAbility.this, this.c);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class g implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ kdb b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ String d;

        public g(gec gecVar, kdb kdbVar, Context context, String str) {
            this.b = kdbVar;
            this.c = context;
            this.d = str;
        }

        @Override // com.alibaba.ability.impl.imagepreview.ImagePreviewAbility.b
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e6d2a8f", new Object[]{this, view});
            } else if (view != null) {
                ep6.d().n(this.d, view);
                LocalBroadcastManager.getInstance(this.c).sendBroadcast(new Intent("mega_dark_page_dx_extension_create"));
            }
        }

        @Override // com.alibaba.ability.impl.imagepreview.ImagePreviewAbility.b
        public void onError(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac367d3a", new Object[]{this, str});
                return;
            }
            ckf.g(str, "message");
            ImagePreviewAbility.access$sendRenderFailBroadcast(ImagePreviewAbility.this, this.c);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class h implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ kdb b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ String d;

        public h(gec gecVar, kdb kdbVar, Context context, String str) {
            this.b = kdbVar;
            this.c = context;
            this.d = str;
        }

        @Override // com.alibaba.ability.impl.imagepreview.ImagePreviewAbility.b
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e6d2a8f", new Object[]{this, view});
            } else if (view != null) {
                ep6.d().n(this.d, view);
                LocalBroadcastManager.getInstance(this.c).sendBroadcast(new Intent("mega_dark_page_dx_extension_create"));
            }
        }

        @Override // com.alibaba.ability.impl.imagepreview.ImagePreviewAbility.b
        public void onError(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac367d3a", new Object[]{this, str});
                return;
            }
            ckf.g(str, "message");
            ImagePreviewAbility.access$sendRenderFailBroadcast(ImagePreviewAbility.this, this.c);
        }
    }

    static {
        t2o.a(110100482);
    }

    public static final /* synthetic */ c48 access$getMDxViewWrapper$p(ImagePreviewAbility imagePreviewAbility) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c48) ipChange.ipc$dispatch("f7a0f12e", new Object[]{imagePreviewAbility});
        }
        return imagePreviewAbility.e;
    }

    public static final /* synthetic */ void access$sendRenderFailBroadcast(ImagePreviewAbility imagePreviewAbility, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8b7d897", new Object[]{imagePreviewAbility, context});
        } else {
            imagePreviewAbility.c(context);
        }
    }

    public static final /* synthetic */ void access$setMDxViewWrapper$p(ImagePreviewAbility imagePreviewAbility, c48 c48Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f977c7a", new Object[]{imagePreviewAbility, c48Var});
        } else {
            imagePreviewAbility.e = c48Var;
        }
    }

    public static /* synthetic */ Object ipc$super(ImagePreviewAbility imagePreviewAbility, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/imagepreview/ImagePreviewAbility");
    }

    public final Pair<Integer, Integer> b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("6b0d9c9b", new Object[]{this, context});
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Object systemService = context.getSystemService(pg1.ATOM_EXT_window);
        if (systemService != null) {
            ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
            return new Pair<>(Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels));
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
    }

    public final void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bc07a9c", new Object[]{this, context});
        } else {
            LocalBroadcastManager.getInstance(context).sendBroadcast(new Intent("mega_dark_page_extension_render_fail"));
        }
    }

    @Override // tb.st, tb.odb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        release();
    }

    public final void release() {
        Context context;
        BroadcastReceiver broadcastReceiver;
        LocalBroadcastManager localBroadcastManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        MyBroadCastReceiver myBroadCastReceiver = this.b;
        if (!(myBroadCastReceiver == null || (localBroadcastManager = this.f1950a) == null)) {
            localBroadcastManager.unregisterReceiver(myBroadCastReceiver);
        }
        this.b = null;
        this.f1950a = null;
        TMSEmbed tMSEmbed = this.c;
        if (tMSEmbed != null) {
            tMSEmbed.d();
        }
        c48 c48Var = this.e;
        if (c48Var != null) {
            c48Var.i();
        }
        if (!(!this.f || (context = this.h) == null || (broadcastReceiver = this.g) == null)) {
            LocalBroadcastManager.getInstance(context).unregisterReceiver(broadcastReceiver);
        }
        ((ArrayList) this.i).clear();
        this.j = null;
    }

    @Override // com.taobao.android.abilityidl.ability.AbsImagePreviewAbility
    public void insert(kdb kdbVar, one oneVar, jdb jdbVar) {
        boolean z;
        String str;
        boolean z2 = true;
        boolean z3 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52bb9042", new Object[]{this, kdbVar, oneVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(oneVar, "params");
        ckf.g(jdbVar, "callback");
        Context context = kdbVar.l().getContext();
        if (context != null) {
            Integer num = oneVar.b;
            if (num == null || (ckf.i(num.intValue(), -1) >= 0 && ckf.i(num.intValue(), ((ArrayList) this.i).size()) <= 0)) {
                ArrayList arrayList = new ArrayList();
                List<tne> list = oneVar.f25506a;
                if (list != null) {
                    Iterator<tne> it = list.iterator();
                    z = false;
                    while (true) {
                        if (!it.hasNext()) {
                            z2 = false;
                            break;
                        }
                        tne next = it.next();
                        PreviewSourceModel previewSourceModel = new PreviewSourceModel(next.f28822a, next.b, next.c, next.d);
                        if (ckf.b(next.f28822a, "IMAGE")) {
                            String str2 = next.b;
                            if (str2 == null || str2.length() == 0) {
                                break;
                            }
                            arrayList.add(previewSourceModel);
                            ((ArrayList) this.i).add(previewSourceModel);
                        } else {
                            String str3 = next.c;
                            if ((str3 == null || str3.length() == 0) && ((str = next.d) == null || str.length() == 0)) {
                                break;
                            }
                            arrayList.add(previewSourceModel);
                            ((ArrayList) this.i).add(previewSourceModel);
                            z = true;
                        }
                    }
                    z2 = false;
                    z3 = true;
                    z = true;
                } else {
                    z2 = false;
                    z = false;
                }
                if (z3) {
                    jdbVar.O(new ErrorResult("MISS_VIDEO_URL_AND_VIDEO_ID", "视频地址和视频 id 均缺失", (Map) null, 4, (a07) null));
                } else if (z2) {
                    jdbVar.O(new ErrorResult("MISS_IMAGE_URL", "图片地址缺失", (Map) null, 4, (a07) null));
                } else if (!z || this.j != null) {
                    Intent intent = new Intent("mega_dark_page_insert_index_param");
                    intent.putExtra("sources", arrayList);
                    intent.putExtra("index", oneVar.b);
                    LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
                } else {
                    jdbVar.O(new ErrorResult("MISS_VIDEO_PLAYER_CONFIG", "播放器配置缺失", (Map) null, 4, (a07) null));
                }
            } else {
                jdbVar.O(new ErrorResult("INDEX_OUT_OF_RANGE", "索引超出范围", (Map) null, 4, (a07) null));
            }
        } else {
            jdbVar.O(ErrorResult.a.Companion.g("context is null"));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsImagePreviewAbility
    public void remove(kdb kdbVar, qne qneVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41cc7cd8", new Object[]{this, kdbVar, qneVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(qneVar, "params");
        ckf.g(jdbVar, "callback");
        Context context = kdbVar.l().getContext();
        if (context != null) {
            List<Integer> list = qneVar.f26835a;
            int[] iArr = null;
            int[] d0 = list != null ? ic1.d0(i04.A0(list)) : null;
            if (d0 != null) {
                for (int i : d0) {
                    if (i >= ((ArrayList) this.i).size() || i < 0) {
                        jdbVar.O(new ErrorResult("INDEX_OUT_OF_RANGE", "索引超出范围", (Map) null, 4, (a07) null));
                        return;
                    } else {
                        ((ArrayList) this.i).remove(i);
                    }
                }
            }
            Intent intent = new Intent("removeIndex");
            List<Integer> list2 = qneVar.f26835a;
            if (list2 != null) {
                iArr = i04.A0(list2);
            }
            intent.putExtra("indexNeedRemove", iArr);
            LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
            return;
        }
        jdbVar.O(ErrorResult.a.Companion.g("context is null"));
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0356  */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.content.Context, T] */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // com.taobao.android.abilityidl.ability.AbsImagePreviewAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void show(final tb.kdb r26, final tb.sne r27, final tb.gec r28) {
        /*
            Method dump skipped, instructions count: 1065
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ability.impl.imagepreview.ImagePreviewAbility.show(tb.kdb, tb.sne, tb.gec):void");
    }

    public final View a(gec gecVar, String str, JSONObject jSONObject, View view, Context context, b bVar) {
        nce nceVar;
        TMSEmbed tMSEmbed;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("995aee47", new Object[]{this, gecVar, str, jSONObject, view, context, bVar});
        }
        if (view != null) {
            return view;
        }
        View view2 = null;
        if (!(context instanceof Activity)) {
            gecVar.O(ErrorResult.a.Companion.g("extend area need activity context"));
            return null;
        }
        if (str != null) {
            boolean I = tsq.I(str, "imagepreview://dinamicx.stdpop.com", false, 2, null);
            boolean b2 = com.taobao.android.weex.b.d().b(str);
            if (I) {
                Uri parse = Uri.parse(str);
                String queryParameter = parse.getQueryParameter("name");
                String str2 = "";
                if (queryParameter == null) {
                    queryParameter = str2;
                }
                String queryParameter2 = parse.getQueryParameter("version");
                long parseLong = queryParameter2 != null ? Long.parseLong(queryParameter2) : 1L;
                String queryParameter3 = parse.getQueryParameter("url");
                if (queryParameter3 != null) {
                    str2 = queryParameter3;
                }
                p18 p18Var = new p18(queryParameter, parseLong, str2);
                p18Var.g(true);
                c48 c48Var = new c48(context, p18Var, "megaimagepreview");
                this.e = c48Var;
                c48Var.g(new c(str, context, bVar, jSONObject));
            } else {
                if (b2) {
                    Weex2StartParams weex2StartParams = new Weex2StartParams();
                    weex2StartParams.setUrl(str);
                    if (jSONObject != null && !jSONObject.isEmpty()) {
                        weex2StartParams.setInitData(jSONObject);
                    }
                    weex2StartParams.setRenderMode(WeexUnicornConfig.RenderMode.texture);
                    xhv xhvVar = xhv.INSTANCE;
                    this.d = weex2StartParams;
                    this.c = new TMSEmbed((Activity) context, TMSEmbedSolutionType.WEEX);
                } else {
                    WebStartParams webStartParams = new WebStartParams();
                    webStartParams.setUrl(str);
                    xhv xhvVar2 = xhv.INSTANCE;
                    this.d = webStartParams;
                    this.c = new TMSEmbed((Activity) context, TMSEmbedSolutionType.WEB_SINGLE_PAGE);
                }
                StartParams startParams = this.d;
                if (!(startParams == null || (tMSEmbed = this.c) == null)) {
                    tMSEmbed.i(startParams);
                }
                TMSEmbed tMSEmbed2 = this.c;
                if (tMSEmbed2 != null) {
                    view2 = tMSEmbed2.h();
                }
                TMSEmbed tMSEmbed3 = this.c;
                if (tMSEmbed3 != null) {
                    tMSEmbed3.u();
                }
                TMSEmbed tMSEmbed4 = this.c;
                if (tMSEmbed4 != null) {
                    tMSEmbed4.r(new d(this, str, context, bVar, jSONObject));
                }
                TMSEmbed tMSEmbed5 = this.c;
                if (!(tMSEmbed5 == null || (nceVar = (nce) tMSEmbed5.g(nce.class)) == null)) {
                    nceVar.g0(new e(this, str, context, bVar, jSONObject));
                }
            }
        }
        return view2;
    }

    public final void setupExtendsArea(mne mneVar, mne mneVar2, mne mneVar3, kdb kdbVar, String str, Context context, gec gecVar) {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21df67f9", new Object[]{this, mneVar, mneVar2, mneVar3, kdbVar, str, context, gecVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(str, tmu.CURRENT_TIME);
        ckf.g(context, "ctx");
        ckf.g(gecVar, "callback");
        JSONObject jSONObject = null;
        if (mneVar != null) {
            JSONObject jSONObject2 = mneVar.b == null ? null : new JSONObject(mneVar.b);
            String str4 = mneVar.f24166a;
            nne nneVar = (nne) kdbVar.m("__mega_native__");
            str2 = "__mega_native__";
            View a2 = a(gecVar, str4, jSONObject2, null, context, new f(gecVar, kdbVar, context, str));
            if (a2 != null) {
                ep6.d().q(str, a2);
            }
        } else {
            str2 = "__mega_native__";
        }
        if (mneVar2 != null) {
            JSONObject jSONObject3 = mneVar2.b == null ? null : new JSONObject(mneVar2.b);
            String str5 = mneVar2.f24166a;
            nne nneVar2 = (nne) kdbVar.m(str2);
            str3 = str2;
            View a3 = a(gecVar, str5, jSONObject3, null, context, new g(gecVar, kdbVar, context, str));
            if (a3 != null) {
                ep6.d().n(str, a3);
            }
        } else {
            str3 = str2;
        }
        if (mneVar3 != null) {
            if (mneVar3.b != null) {
                jSONObject = new JSONObject(mneVar3.b);
            }
            String str6 = mneVar3.f24166a;
            nne nneVar3 = (nne) kdbVar.m(str3);
            View a4 = a(gecVar, str6, jSONObject, null, context, new h(gecVar, kdbVar, context, str));
            if (a4 != null) {
                ep6.d().l(str, a4);
            }
        }
        LocalBroadcastManager.getInstance(context).sendBroadcast(new Intent("mega_dark_page_dx_extension_create"));
    }
}
