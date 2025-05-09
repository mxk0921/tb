package com.taobao.android.dxv4common.logic.dex;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.auth.mobile.common.AlipayAuthConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dxv4common.logic.dex.DXModuleManager;
import com.taobao.android.dxv4common.logic.dex.bridge.DXNativeLogicEngine;
import com.taobao.android.dxv4common.logic.dex.bridge.DXNativeLogicLoader;
import com.taobao.android.dxv4common.model.node.event.DXNativeLogicEventProperty;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import tb.dx5;
import tb.ic5;
import tb.jb6;
import tb.la6;
import tb.rle;
import tb.t2o;
import tb.uh6;
import tb.wh6;
import tb.xh6;
import tb.xv5;
import tb.zg5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXNativeLogicLoadTask implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int MAIN_DX_LENGTH = 7;
    private static final String PREFIX_LOGIC_CONFIG = "/config.json";
    private static final String PREFIX_LOGIC_FILE = "logic";
    public b callback;
    public WeakReference<DXWidgetNode> weakNode;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements DXModuleManager.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f7598a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;
        public final /* synthetic */ DXWidgetNode g;
        public final /* synthetic */ DXTemplateItem h;
        public final /* synthetic */ String i;

        public a(String str, String str2, String str3, String str4, String str5, String str6, DXWidgetNode dXWidgetNode, DXTemplateItem dXTemplateItem, String str7) {
            this.f7598a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
            this.g = dXWidgetNode;
            this.h = dXTemplateItem;
            this.i = str7;
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("239cc86e", new Object[]{this, str});
                return;
            }
            String str2 = " load module失败  " + str;
            b bVar = DXNativeLogicLoadTask.this.callback;
            if (bVar != null) {
                ((DXNativeLogicEventProperty.a) bVar).a(str2);
            }
            f fVar = new f(this.i);
            fVar.b = this.h;
            f.a aVar = new f.a("DX_V4_LOGIC", "DX_V4_LOGIC_ERROR", f.DX_V4_LOGIC_4100004);
            aVar.e = str2;
            ((ArrayList) fVar.c).add(aVar);
            ic5.p(fVar);
            la6.b(str2);
        }

        public void b(List<DXNativeLogicLoader> list) {
            DXTemplateItem dXTemplateItem;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8fda9ca", new Object[]{this, list});
                return;
            }
            String str = "";
            try {
                str = this.f7598a + wh6.DIR + this.b;
                this.g.getDxv4Properties().x(new DXNativeLogicEngine(str, this.c, this.d, this.e, this.f, list));
                b bVar = DXNativeLogicLoadTask.this.callback;
                if (bVar != null) {
                    ((DXNativeLogicEventProperty.a) bVar).b();
                }
            } catch (Throwable th) {
                try {
                    File file = new File(str);
                    StringBuilder sb = new StringBuilder();
                    File file2 = new File(this.h.k.f31396a);
                    sb.append(str);
                    sb.append(" 文件是否存在 ");
                    sb.append(file.exists());
                    sb.append("; mainFile ");
                    sb.append(this.h.k.f31396a);
                    sb.append(file2.exists());
                    sb.append("; 模板是否存在 ");
                    sb.append(uh6.h().q(this.i, this.h));
                    sb.append(xv5.a(th));
                    if (zg5.g5() && !file.exists()) {
                        String[] split = str.split("/");
                        if (split.length <= 10 || !str.contains("/subTemplates/")) {
                            dXTemplateItem = this.h;
                        } else {
                            dXTemplateItem = new DXTemplateItem();
                            dXTemplateItem.f7343a = split[8];
                            dXTemplateItem.b = Long.parseLong(split[9]);
                        }
                        String str2 = str + " !dexFile.exists() 直接移除该模板   hostItem " + dXTemplateItem.d();
                        uh6.h().t(this.i, dXTemplateItem);
                        la6.b(str2);
                        sb.append(" errorReason ");
                        sb.append(str2);
                    }
                    f fVar = new f(this.i);
                    fVar.b = this.h;
                    f.a aVar = new f.a("DX_V4_LOGIC", "DX_V4_LOGIC_ERROR", f.DX_V4_LOGIC_4100001);
                    aVar.e = sb.toString();
                    ((ArrayList) fVar.c).add(aVar);
                    ic5.p(fVar);
                    xv5.b(th);
                } catch (Exception e) {
                    la6.b(xv5.a(e));
                    xv5.d(e);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface b {
    }

    static {
        t2o.a(444597952);
    }

    public DXNativeLogicLoadTask(WeakReference<DXWidgetNode> weakReference) {
        this.weakNode = weakReference;
    }

    public static void asyncLoadData(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c51b20bc", new Object[]{dXWidgetNode});
        } else if (dXWidgetNode.getDxv4Properties().f() == null) {
            jb6.r(new DXNativeLogicLoadTask(new WeakReference(dXWidgetNode)));
        }
    }

    public static void syncLoadData(DXWidgetNode dXWidgetNode, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35a9dc69", new Object[]{dXWidgetNode, bVar});
        } else {
            new DXNativeLogicLoadTask(new WeakReference(dXWidgetNode), bVar).run();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        xh6 xh6Var;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            DXWidgetNode dXWidgetNode = this.weakNode.get();
            if (dXWidgetNode != null) {
                String c = dXWidgetNode.getDXRuntimeContext().c();
                DXTemplateItem p = dXWidgetNode.getDXRuntimeContext().p();
                if (p != null && (xh6Var = p.k) != null) {
                    String substring = xh6Var.f31396a.substring(0, str.length() - 7);
                    if (!TextUtils.isEmpty(substring)) {
                        String str2 = substring + PREFIX_LOGIC_FILE;
                        String str3 = str2 + PREFIX_LOGIC_CONFIG;
                        File file = new File(str3);
                        if (!TextUtils.isEmpty(str3) && file.exists()) {
                            JSONObject i = dx5.d().i(str3, dXWidgetNode.getDXRuntimeContext());
                            if (i != null) {
                                String string = i.getString("fileName");
                                JSONObject jSONObject = i.getJSONObject("clsConfig");
                                DXModuleManager.getInstance().load(i.getString(rle.MODULES), new a(str2, string, jSONObject.getString(AlipayAuthConstant.FULL_CLASS_NAME), jSONObject.getString("eventClassName"), jSONObject.getString("runtimeClassName"), jSONObject.getString("bridgeClassName"), dXWidgetNode, p, c));
                                return;
                            }
                            return;
                        }
                        la6.b("DXNativeLogicLoadTask  : " + str3 + " 文件不存在，无需在load ");
                    }
                }
            }
        } catch (Throwable th) {
            xv5.d(th);
        }
    }

    public DXNativeLogicLoadTask(WeakReference<DXWidgetNode> weakReference, b bVar) {
        this.weakNode = weakReference;
        this.callback = bVar;
    }
}
