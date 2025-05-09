package com.taobao.android.weex_uikit.widget.input;

import android.content.Context;
import android.text.InputFilter;
import android.widget.EditText;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeType;
import com.taobao.android.weex_uikit.widget.input.a;
import com.taobao.android.weex_uikit.widget.input.c;
import com.taobao.weex.common.Constants;
import java.util.HashMap;
import java.util.Map;
import tb.egl;
import tb.jxh;
import tb.ny1;
import tb.pvh;
import tb.t2o;
import tb.yio;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class BaseInput extends UINode {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Map<String, Object> ATTR_DEF_MAP;
    public a.b formatter;
    public c.d unregister;
    public com.taobao.android.weex_uikit.widget.input.b watcher;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ UINode d;

        public a(UINode uINode) {
            this.d = uINode;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/input/BaseInput$1");
        }

        @Override // tb.yio
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                com.taobao.android.weex_uikit.widget.input.a.d(this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ UINode d;

        public b(UINode uINode) {
            this.d = uINode;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/input/BaseInput$2");
        }

        @Override // tb.yio
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                com.taobao.android.weex_uikit.widget.input.a.b(this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ UINode d;

        public c(UINode uINode) {
            this.d = uINode;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/input/BaseInput$3");
        }

        @Override // tb.yio
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                com.taobao.android.weex_uikit.widget.input.a.c(this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ UINode d;
        public final /* synthetic */ MUSValue[] e;

        public d(UINode uINode, MUSValue[] mUSValueArr) {
            this.d = uINode;
            this.e = mUSValueArr;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/input/BaseInput$4");
        }

        @Override // tb.yio
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            UINode uINode = this.d;
            MUSDKInstance instance = BaseInput.this.getInstance();
            Class cls = Integer.TYPE;
            com.taobao.android.weex_uikit.widget.input.a.G(uINode, ((Integer) jxh.e(instance, null, cls, BaseInput.access$000(BaseInput.this, this.e, 0))).intValue(), ((Integer) jxh.e(BaseInput.this.getInstance(), null, cls, BaseInput.access$100(BaseInput.this, this.e, 1))).intValue());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ UINode d;
        public final /* synthetic */ MUSValue[] e;

        public e(UINode uINode, MUSValue[] mUSValueArr) {
            this.d = uINode;
            this.e = mUSValueArr;
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/input/BaseInput$5");
        }

        @Override // tb.yio
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                com.taobao.android.weex_uikit.widget.input.a.f(this.d, (pvh) jxh.e(BaseInput.this.getInstance(), null, pvh.class, BaseInput.access$200(BaseInput.this, this.e, 0)));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class f extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ UINode d;
        public final /* synthetic */ MUSValue[] e;

        public f(UINode uINode, MUSValue[] mUSValueArr) {
            this.d = uINode;
            this.e = mUSValueArr;
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/input/BaseInput$6");
        }

        @Override // tb.yio
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                com.taobao.android.weex_uikit.widget.input.a.J(this.d, (JSONObject) jxh.e(BaseInput.this.getInstance(), null, JSONObject.class, BaseInput.access$300(BaseInput.this, this.e, 0)), BaseInput.this.formatter);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class g extends ny1<BaseInput> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(986710152);
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/input/BaseInput$NodeHolder");
        }

        @Override // tb.vtf
        public String getMethods() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("615a6cfd", new Object[]{this});
            }
            return "[\"focus\",\"blur\",\"clear\",\"setSelectionRange\",\"getSelectionRange\",\"setTextFormatter\"]";
        }
    }

    public BaseInput(int i) {
        super(i);
    }

    public static /* synthetic */ MUSValue access$000(BaseInput baseInput, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSValue) ipChange.ipc$dispatch("753c417d", new Object[]{baseInput, mUSValueArr, new Integer(i)});
        }
        return baseInput.getArgument(mUSValueArr, i);
    }

    public static /* synthetic */ MUSValue access$100(BaseInput baseInput, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSValue) ipChange.ipc$dispatch("d9b90c1c", new Object[]{baseInput, mUSValueArr, new Integer(i)});
        }
        return baseInput.getArgument(mUSValueArr, i);
    }

    public static /* synthetic */ MUSValue access$200(BaseInput baseInput, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSValue) ipChange.ipc$dispatch("3e35d6bb", new Object[]{baseInput, mUSValueArr, new Integer(i)});
        }
        return baseInput.getArgument(mUSValueArr, i);
    }

    public static /* synthetic */ MUSValue access$300(BaseInput baseInput, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSValue) ipChange.ipc$dispatch("a2b2a15a", new Object[]{baseInput, mUSValueArr, new Integer(i)});
        }
        return baseInput.getArgument(mUSValueArr, i);
    }

    public static /* synthetic */ Object ipc$super(BaseInput baseInput, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/input/BaseInput");
    }

    public void blur(UINode uINode, MUSValue[] mUSValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75248528", new Object[]{this, uINode, mUSValueArr});
        } else {
            dispatchMethodToMain(new b(uINode));
        }
    }

    @Override // tb.hvu
    public boolean canPreallocate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ad6217b", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public void clear(UINode uINode, MUSValue[] mUSValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef1ea78e", new Object[]{this, uINode, mUSValueArr});
        } else {
            dispatchMethodToMain(new c(uINode));
        }
    }

    public void focus(UINode uINode, MUSValue[] mUSValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1090659", new Object[]{this, uINode, mUSValueArr});
        } else {
            dispatchMethodToMain(new a(uINode));
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public Object getDefaultAttribute(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("acae82d0", new Object[]{this, str});
        }
        return ATTR_DEF_MAP.get(str);
    }

    @Override // tb.hvu
    public UINodeType getNodeType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UINodeType) ipChange.ipc$dispatch("a8f3a2f7", new Object[]{this});
        }
        return UINodeType.VIEW;
    }

    public void getSelectionRange(UINode uINode, MUSValue[] mUSValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc21c8c8", new Object[]{this, uINode, mUSValueArr});
        } else {
            dispatchMethodToMain(new e(uINode, mUSValueArr));
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public boolean isGenerated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e95a1590", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.hvu
    public Object onCreateMountContent(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c9369e6c", new Object[]{this, context});
        }
        return com.taobao.android.weex_uikit.widget.input.a.i(context);
    }

    @Override // tb.hvu
    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        egl eglVar = new egl();
        egl eglVar2 = new egl();
        com.taobao.android.weex_uikit.widget.input.a.j(this, mUSDKInstance, (EditText) obj, eglVar, this.formatter, eglVar2);
        if (eglVar.b()) {
            this.watcher = (com.taobao.android.weex_uikit.widget.input.b) eglVar.a();
        }
        if (eglVar2.b()) {
            this.unregister = (c.d) eglVar2.a();
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void onNodeCreate(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78938224", new Object[]{this, uINode});
            return;
        }
        egl eglVar = new egl();
        com.taobao.android.weex_uikit.widget.input.a.k(uINode, eglVar);
        if (eglVar.b()) {
            this.formatter = (a.b) eglVar.a();
        }
    }

    @Override // tb.hvu
    public void onUnmount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dcc50a", new Object[]{this, mUSDKInstance, obj});
        } else {
            com.taobao.android.weex_uikit.widget.input.a.l(this, mUSDKInstance, (EditText) obj, this.watcher, this.unregister);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void onUpdateExtra(UINode uINode, Object obj, String str, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40a127bb", new Object[]{this, uINode, obj, str, obj2});
        } else {
            com.taobao.android.weex_uikit.widget.input.a.x(uINode, (EditText) obj, str, obj2);
        }
    }

    @Override // tb.hvu
    public int poolSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9bdc9c37", new Object[]{this})).intValue();
        }
        return 3;
    }

    public void refreshColor(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47ba8fd1", new Object[]{this, uINode, obj, obj2});
        } else {
            com.taobao.android.weex_uikit.widget.input.a.n(uINode, (EditText) obj, ((Integer) obj2).intValue());
        }
    }

    public void refreshFilter(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d693e46", new Object[]{this, uINode, obj, obj2});
        } else {
            com.taobao.android.weex_uikit.widget.input.a.o(uINode, (EditText) obj, (InputFilter.LengthFilter) obj2);
        }
    }

    public void refreshFontSize(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b2b28e", new Object[]{this, uINode, obj, obj2});
        } else {
            com.taobao.android.weex_uikit.widget.input.a.p(uINode, (EditText) obj, ((Integer) obj2).intValue());
        }
    }

    public void refreshPlaceHolder(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c881bb61", new Object[]{this, uINode, obj, obj2});
        } else {
            com.taobao.android.weex_uikit.widget.input.a.q(uINode, (EditText) obj, (String) obj2);
        }
    }

    public void refreshPlaceHolderColor(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac26a0ee", new Object[]{this, uINode, obj, obj2});
        } else {
            com.taobao.android.weex_uikit.widget.input.a.r(uINode, (EditText) obj, ((Integer) obj2).intValue());
        }
    }

    public void refreshSingleLine(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e91c6f62", new Object[]{this, uINode, obj, obj2});
        } else {
            com.taobao.android.weex_uikit.widget.input.a.s(uINode, (EditText) obj, ((Boolean) obj2).booleanValue());
        }
    }

    public void refreshTextAlign(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b0d947c", new Object[]{this, uINode, obj, obj2});
        } else {
            com.taobao.android.weex_uikit.widget.input.a.t(uINode, (EditText) obj, ((Integer) obj2).intValue());
        }
    }

    public void refreshType(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ff3ac04", new Object[]{this, uINode, obj, obj2});
        } else {
            com.taobao.android.weex_uikit.widget.input.a.u(uINode, (EditText) obj, (String) obj2);
        }
    }

    public void setAutoFocus(UINode uINode, MUSValue mUSValue) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("981dd0c7", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (!MUSValue.isNill(mUSValue)) {
            z = ((Boolean) jxh.e(getInstance(), null, Boolean.TYPE, mUSValue)).booleanValue();
        }
        com.taobao.android.weex_uikit.widget.input.a.v(uINode, z);
    }

    public void setColor(UINode uINode, MUSValue mUSValue) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("379fec0d", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (MUSValue.isNill(mUSValue)) {
            str = "";
        } else {
            str = (String) jxh.e(getInstance(), null, String.class, mUSValue);
        }
        com.taobao.android.weex_uikit.widget.input.a.w(uINode, str);
    }

    public void setFontSize(UINode uINode, MUSValue mUSValue) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4429d1dc", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (MUSValue.isNill(mUSValue)) {
            str = "";
        } else {
            str = (String) jxh.e(getInstance(), null, String.class, mUSValue);
        }
        com.taobao.android.weex_uikit.widget.input.a.y(uINode, str);
    }

    public void setMax(UINode uINode, MUSValue mUSValue) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b45f69ac", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (MUSValue.isNill(mUSValue)) {
            str = "";
        } else {
            str = (String) jxh.e(getInstance(), null, String.class, mUSValue);
        }
        com.taobao.android.weex_uikit.widget.input.a.z(uINode, str);
    }

    public void setMaxLength(UINode uINode, MUSValue mUSValue) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4622d6e6", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (MUSValue.isNill(mUSValue)) {
            str = "";
        } else {
            str = (String) jxh.e(getInstance(), null, String.class, mUSValue);
        }
        com.taobao.android.weex_uikit.widget.input.a.A(uINode, str);
    }

    public void setMaxSlashLength(UINode uINode, MUSValue mUSValue) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76d5886d", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (MUSValue.isNill(mUSValue)) {
            str = "";
        } else {
            str = (String) jxh.e(getInstance(), null, String.class, mUSValue);
        }
        com.taobao.android.weex_uikit.widget.input.a.B(uINode, str);
    }

    public void setMin(UINode uINode, MUSValue mUSValue) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b64b207e", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (MUSValue.isNill(mUSValue)) {
            str = "";
        } else {
            str = (String) jxh.e(getInstance(), null, String.class, mUSValue);
        }
        com.taobao.android.weex_uikit.widget.input.a.C(uINode, str);
    }

    public void setPlaceHolder(UINode uINode, MUSValue mUSValue) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6600b65d", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (MUSValue.isNill(mUSValue)) {
            str = "";
        } else {
            str = (String) jxh.e(getInstance(), null, String.class, mUSValue);
        }
        com.taobao.android.weex_uikit.widget.input.a.D(uINode, str);
    }

    public void setPlaceHolderColor(UINode uINode, MUSValue mUSValue) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92f8f73c", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (MUSValue.isNill(mUSValue)) {
            str = "";
        } else {
            str = (String) jxh.e(getInstance(), null, String.class, mUSValue);
        }
        com.taobao.android.weex_uikit.widget.input.a.E(uINode, str);
    }

    public void setReturnKeyType(UINode uINode, MUSValue mUSValue) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0d70d47", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (MUSValue.isNill(mUSValue)) {
            str = "default";
        } else {
            str = (String) jxh.e(getInstance(), null, String.class, mUSValue);
        }
        com.taobao.android.weex_uikit.widget.input.a.F(uINode, str);
    }

    public void setSelectionRange(UINode uINode, MUSValue[] mUSValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be2499d4", new Object[]{this, uINode, mUSValueArr});
        } else {
            dispatchMethodToMain(new d(uINode, mUSValueArr));
        }
    }

    public void setSingleLine(UINode uINode, MUSValue mUSValue) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca6a0870", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (!MUSValue.isNill(mUSValue)) {
            z = ((Boolean) jxh.e(getInstance(), null, Boolean.TYPE, mUSValue)).booleanValue();
        }
        com.taobao.android.weex_uikit.widget.input.a.H(uINode, z);
    }

    public void setTextAlign(UINode uINode, MUSValue mUSValue) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdb01a38", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (MUSValue.isNill(mUSValue)) {
            str = "";
        } else {
            str = (String) jxh.e(getInstance(), null, String.class, mUSValue);
        }
        com.taobao.android.weex_uikit.widget.input.a.I(uINode, str);
    }

    public void setTextFormatter(UINode uINode, MUSValue[] mUSValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f7c9c", new Object[]{this, uINode, mUSValueArr});
        } else {
            dispatchMethodToMain(new f(uINode, mUSValueArr));
        }
    }

    public void setType(UINode uINode, MUSValue mUSValue) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21ea89d2", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (MUSValue.isNill(mUSValue)) {
            str = "text";
        } else {
            str = (String) jxh.e(getInstance(), null, String.class, mUSValue);
        }
        com.taobao.android.weex_uikit.widget.input.a.K(uINode, str);
    }

    public void setValue(UINode uINode, MUSValue mUSValue) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e148c5bf", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (MUSValue.isNill(mUSValue)) {
            str = "";
        } else {
            str = (String) jxh.e(getInstance(), null, String.class, mUSValue);
        }
        com.taobao.android.weex_uikit.widget.input.a.L(uINode, str);
    }

    static {
        t2o.a(986710145);
        HashMap hashMap = new HashMap();
        ATTR_DEF_MAP = hashMap;
        hashMap.put("type", "text");
        hashMap.put(Constants.Name.TEXT_ALIGN, 3);
        hashMap.put(Constants.Name.SINGLELINE, Boolean.TRUE);
        hashMap.put("fontSize", Integer.valueOf(com.taobao.android.weex_uikit.widget.input.a.DEF_FONT_SIZE));
        hashMap.put("returnKeyType", 0);
        hashMap.put(Constants.Name.AUTOFOCUS, Boolean.FALSE);
        hashMap.put(Constants.Name.PLACEHOLDER_COLOR, -6710887);
        hashMap.put("color", -16777216);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
        if (r9.equals(com.taobao.weex.common.Constants.Event.FOCUS) == false) goto L_0x0026;
     */
    @Override // com.taobao.android.weex_uikit.ui.UINode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onDispatchMethod(com.taobao.android.weex_uikit.ui.UINode r8, java.lang.String r9, com.taobao.android.weex_framework.MUSValue[] r10) {
        /*
            r7 = this;
            r0 = 3
            r1 = 2
            r2 = 1
            r3 = 0
            r4 = 4
            com.android.alibaba.ip.runtime.IpChange r5 = com.taobao.android.weex_uikit.widget.input.BaseInput.$ipChange
            boolean r6 = r5 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r6 == 0) goto L_0x001b
            java.lang.String r6 = "3d011af1"
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r3] = r7
            r4[r2] = r8
            r4[r1] = r9
            r4[r0] = r10
            r5.ipc$dispatch(r6, r4)
            return
        L_0x001b:
            r9.hashCode()
            r5 = -1
            int r6 = r9.hashCode()
            switch(r6) {
                case -862768933: goto L_0x005e;
                case 3027047: goto L_0x0053;
                case 94746189: goto L_0x0048;
                case 97604824: goto L_0x003f;
                case 923542547: goto L_0x0033;
                case 1863695367: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            r0 = -1
            goto L_0x0069
        L_0x0028:
            java.lang.String r0 = "getSelectionRange"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0031
            goto L_0x0026
        L_0x0031:
            r0 = 5
            goto L_0x0069
        L_0x0033:
            java.lang.String r0 = "setSelectionRange"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x003d
            goto L_0x0026
        L_0x003d:
            r0 = 4
            goto L_0x0069
        L_0x003f:
            java.lang.String r1 = "focus"
            boolean r9 = r9.equals(r1)
            if (r9 != 0) goto L_0x0069
            goto L_0x0026
        L_0x0048:
            java.lang.String r0 = "clear"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0051
            goto L_0x0026
        L_0x0051:
            r0 = 2
            goto L_0x0069
        L_0x0053:
            java.lang.String r0 = "blur"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x005c
            goto L_0x0026
        L_0x005c:
            r0 = 1
            goto L_0x0069
        L_0x005e:
            java.lang.String r0 = "setTextFormatter"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0068
            goto L_0x0026
        L_0x0068:
            r0 = 0
        L_0x0069:
            switch(r0) {
                case 0: goto L_0x0081;
                case 1: goto L_0x007d;
                case 2: goto L_0x0079;
                case 3: goto L_0x0075;
                case 4: goto L_0x0071;
                case 5: goto L_0x006d;
                default: goto L_0x006c;
            }
        L_0x006c:
            goto L_0x0084
        L_0x006d:
            r7.getSelectionRange(r8, r10)
            goto L_0x0084
        L_0x0071:
            r7.setSelectionRange(r8, r10)
            goto L_0x0084
        L_0x0075:
            r7.focus(r8, r10)
            goto L_0x0084
        L_0x0079:
            r7.clear(r8, r10)
            goto L_0x0084
        L_0x007d:
            r7.blur(r8, r10)
            goto L_0x0084
        L_0x0081:
            r7.setTextFormatter(r8, r10)
        L_0x0084:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_uikit.widget.input.BaseInput.onDispatchMethod(com.taobao.android.weex_uikit.ui.UINode, java.lang.String, com.taobao.android.weex_framework.MUSValue[]):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b7, code lost:
        if (r9.equals("max") == false) goto L_0x002d;
     */
    @Override // com.taobao.android.weex_uikit.ui.UINode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onUpdateAttr(com.taobao.android.weex_uikit.ui.UINode r8, java.lang.String r9, com.taobao.android.weex_framework.MUSValue r10) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_uikit.widget.input.BaseInput.onUpdateAttr(com.taobao.android.weex_uikit.ui.UINode, java.lang.String, com.taobao.android.weex_framework.MUSValue):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
        if (r11.equals("color") == false) goto L_0x0029;
     */
    @Override // com.taobao.android.weex_uikit.ui.UINode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onRefreshAttribute(com.taobao.android.weex_uikit.ui.UINode r9, java.lang.Object r10, java.lang.String r11, java.lang.Object r12) {
        /*
            r8 = this;
            r0 = 4
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            r5 = 5
            com.android.alibaba.ip.runtime.IpChange r6 = com.taobao.android.weex_uikit.widget.input.BaseInput.$ipChange
            boolean r7 = r6 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r7 == 0) goto L_0x001e
            java.lang.String r7 = "fd3c7823"
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r4] = r8
            r5[r3] = r9
            r5[r2] = r10
            r5[r1] = r11
            r5[r0] = r12
            r6.ipc$dispatch(r7, r5)
            return
        L_0x001e:
            r11.hashCode()
            r6 = -1
            int r7 = r11.hashCode()
            switch(r7) {
                case -1576785488: goto L_0x007a;
                case -1274492040: goto L_0x006f;
                case -1065511464: goto L_0x0063;
                case 3575610: goto L_0x0057;
                case 94842723: goto L_0x004e;
                case 365601008: goto L_0x0043;
                case 598246771: goto L_0x0037;
                case 914346044: goto L_0x002b;
                default: goto L_0x0029;
            }
        L_0x0029:
            r0 = -1
            goto L_0x0085
        L_0x002b:
            java.lang.String r0 = "singleline"
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto L_0x0035
            goto L_0x0029
        L_0x0035:
            r0 = 7
            goto L_0x0085
        L_0x0037:
            java.lang.String r0 = "placeholder"
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto L_0x0041
            goto L_0x0029
        L_0x0041:
            r0 = 6
            goto L_0x0085
        L_0x0043:
            java.lang.String r0 = "fontSize"
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto L_0x004c
            goto L_0x0029
        L_0x004c:
            r0 = 5
            goto L_0x0085
        L_0x004e:
            java.lang.String r1 = "color"
            boolean r11 = r11.equals(r1)
            if (r11 != 0) goto L_0x0085
            goto L_0x0029
        L_0x0057:
            java.lang.String r0 = "type"
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto L_0x0061
            goto L_0x0029
        L_0x0061:
            r0 = 3
            goto L_0x0085
        L_0x0063:
            java.lang.String r0 = "textAlign"
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto L_0x006d
            goto L_0x0029
        L_0x006d:
            r0 = 2
            goto L_0x0085
        L_0x006f:
            java.lang.String r0 = "filter"
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto L_0x0078
            goto L_0x0029
        L_0x0078:
            r0 = 1
            goto L_0x0085
        L_0x007a:
            java.lang.String r0 = "placeholderColor"
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto L_0x0084
            goto L_0x0029
        L_0x0084:
            r0 = 0
        L_0x0085:
            switch(r0) {
                case 0: goto L_0x00a5;
                case 1: goto L_0x00a1;
                case 2: goto L_0x009d;
                case 3: goto L_0x0099;
                case 4: goto L_0x0095;
                case 5: goto L_0x0091;
                case 6: goto L_0x008d;
                case 7: goto L_0x0089;
                default: goto L_0x0088;
            }
        L_0x0088:
            goto L_0x00a8
        L_0x0089:
            r8.refreshSingleLine(r9, r10, r12)
            goto L_0x00a8
        L_0x008d:
            r8.refreshPlaceHolder(r9, r10, r12)
            goto L_0x00a8
        L_0x0091:
            r8.refreshFontSize(r9, r10, r12)
            goto L_0x00a8
        L_0x0095:
            r8.refreshColor(r9, r10, r12)
            goto L_0x00a8
        L_0x0099:
            r8.refreshType(r9, r10, r12)
            goto L_0x00a8
        L_0x009d:
            r8.refreshTextAlign(r9, r10, r12)
            goto L_0x00a8
        L_0x00a1:
            r8.refreshFilter(r9, r10, r12)
            goto L_0x00a8
        L_0x00a5:
            r8.refreshPlaceHolderColor(r9, r10, r12)
        L_0x00a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_uikit.widget.input.BaseInput.onRefreshAttribute(com.taobao.android.weex_uikit.ui.UINode, java.lang.Object, java.lang.String, java.lang.Object):void");
    }
}
