package tb;

import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXButterRootView;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.schedule.ViewProxy;
import java.util.Map;
import kotlin.Result;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class l7v {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final l7v INSTANCE = new l7v();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f23163a;
        public final /* synthetic */ StringBuilder b;
        public final /* synthetic */ Ref$ObjectRef c;
        public final /* synthetic */ IDMComponent d;
        public final /* synthetic */ Map e;

        public b(String str, StringBuilder sb, Ref$ObjectRef ref$ObjectRef, IDMComponent iDMComponent, Context context, Map map) {
            this.f23163a = str;
            this.b = sb;
            this.c = ref$ObjectRef;
            this.d = iDMComponent;
            this.e = map;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            Object systemService = ((Context) this.c.element).getSystemService("clipboard");
            if (systemService != null) {
                String str = this.f23163a;
                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(str, this.f23163a + "\n" + ((Object) this.b)));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.content.ClipboardManager");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class c implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final c INSTANCE = new c();

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
            } else {
                dialogInterface.dismiss();
            }
        }
    }

    static {
        t2o.a(157286738);
    }

    public static final /* synthetic */ boolean a(l7v l7vVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4427a72", new Object[]{l7vVar, str})).booleanValue();
        }
        return l7vVar.b(str);
    }

    @JvmStatic
    public static final void c(String str, DXRootView dXRootView, IDMComponent iDMComponent) {
        View view;
        DXWidgetNode flattenWidgetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2960d2f", new Object[]{str, dXRootView, iDMComponent});
            return;
        }
        ckf.g(dXRootView, "dxRootView");
        ckf.g(iDMComponent, "component");
        if (!INSTANCE.b(str)) {
            if (dXRootView.getFlattenWidgetNode() == null || (flattenWidgetNode = dXRootView.getFlattenWidgetNode()) == null || flattenWidgetNode.getDXRuntimeContext() == null) {
                view = null;
            } else {
                DXRuntimeContext dXRuntimeContext = flattenWidgetNode.getDXRuntimeContext();
                ckf.f(dXRuntimeContext, "widgetNode.dxRuntimeContext");
                view = dXRuntimeContext.D();
            }
            if (view != null) {
                ViewProxy.setOnLongClickListener(view, new a(str, dXRootView, iDMComponent));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a implements View.OnLongClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f23162a;
        public final /* synthetic */ DXRootView b;
        public final /* synthetic */ IDMComponent c;

        public a(String str, DXRootView dXRootView, IDMComponent iDMComponent) {
            this.f23162a = str;
            this.b = dXRootView;
            this.c = iDMComponent;
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
            }
            if (!l7v.a(l7v.INSTANCE, this.f23162a)) {
                l7v.d(this.b.getContext(), this.c, kotlin.collections.a.k(jpu.a("模板是否开启Butter：", String.valueOf(this.b instanceof DXButterRootView))));
            }
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [android.content.Context, T] */
    @JvmStatic
    public static final void d(Context context, IDMComponent iDMComponent, Map<String, String> map) {
        Object obj;
        Ref$ObjectRef ref$ObjectRef;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1265fac", new Object[]{context, iDMComponent, map});
        } else if (iDMComponent != null && context != 0) {
            try {
                ref$ObjectRef = new Ref$ObjectRef();
                ref$ObjectRef.element = context;
                if (context instanceof bew) {
                    ref$ObjectRef.element = ((bew) context).b();
                }
            } catch (Throwable th) {
                obj = Result.m1108constructorimpl(kotlin.b.a(th));
            }
            if (((Context) ref$ObjectRef.element) != null) {
                AlertDialog create = new AlertDialog.Builder((Context) ref$ObjectRef.element).create();
                String str = "组件：" + iDMComponent.getKey();
                create.setTitle(str);
                StringBuilder sb = new StringBuilder();
                JSONObject containerInfo = iDMComponent.getContainerInfo();
                if (containerInfo != null) {
                    String string = containerInfo.getString("name");
                    String string2 = containerInfo.getString("version");
                    sb.append("模板类型：");
                    sb.append(iDMComponent.getContainerType());
                    sb.append("\n模板名称：");
                    sb.append(string);
                    sb.append("\n模板版本：");
                    sb.append(string2);
                }
                if (map != null) {
                    for (String str2 : map.keySet()) {
                        sb.append('\n' + str2);
                        sb.append(map.get(str2));
                    }
                }
                sb.append("\n\n-------fields-------\n");
                sb.append(JSON.toJSONString(iDMComponent.getFields()));
                sb.append("\n\n-------events-------\n");
                sb.append(iDMComponent.getEvents());
                create.setButton(-1, "关闭", c.INSTANCE);
                create.setButton(-2, "复制到剪切板", new b(str, sb, ref$ObjectRef, iDMComponent, context, map));
                create.setMessage(sb);
                create.setCancelable(true);
                create.show();
                obj = Result.m1108constructorimpl(xhv.INSTANCE);
                if (Result.m1114isFailureimpl(obj)) {
                    Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
                    hav.a("UltronDebugInterfaceException", th2 != null ? th2.getMessage() : null);
                }
            }
        }
    }

    public final boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a376abc8", new Object[]{this, str})).booleanValue();
        }
        return !n7v.a() || !vav.a(str, "showDebugDialogOnLongClick", false);
    }
}
