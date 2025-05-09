package com.taobao.android.weex_uikit.widget.input;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSProps;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeType;
import com.taobao.android.weex_uikit.widget.input.BaseInput;
import com.taobao.weex.common.Constants;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class Input extends BaseInput {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String beforeText;
    private CharSequence lastValue;
    private InputListenerInfo listenerInfo = new InputListenerInfo();
    private boolean ignoreNextOnInputEvent = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements View.OnFocusChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1621df92", new Object[]{this, view, new Boolean(z)});
            } else if (Input.this.isMounted()) {
                EditText editText = (EditText) Input.this.getMountContent();
                if (z) {
                    Input.access$002(Input.this, editText.getText().toString());
                    return;
                }
                CharSequence text = editText.getText();
                if (text == null) {
                    text = "";
                }
                if (!TextUtils.equals(text, Input.access$000(Input.this))) {
                    Input.this.fireEvent("change", null);
                    Input.access$002(Input.this, editText.getText().toString());
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements TextWatcher {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("77fdbb29", new Object[]{this, editable});
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("acba1d0", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
            } else if (Input.this.isMounted()) {
                if (Input.access$100(Input.this)) {
                    Input.access$102(Input.this, false);
                    Input.access$202(Input.this, charSequence.toString());
                } else if (!TextUtils.equals(Input.access$200(Input.this), charSequence)) {
                    Input.access$202(Input.this, charSequence.toString());
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("value", (Object) charSequence.toString());
                    Input.this.fireEvent("input", jSONObject);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements View.OnFocusChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1621df92", new Object[]{this, view, new Boolean(z)});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("timeStamp", (Object) Long.valueOf(System.currentTimeMillis()));
            if (z && Input.this.hasEvent(Constants.Event.FOCUS)) {
                Input.this.fireEvent(Constants.Event.FOCUS, jSONObject);
            } else if (!z && Input.this.hasEvent(Constants.Event.BLUR)) {
                Input.this.fireEvent(Constants.Event.BLUR, jSONObject);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class d extends BaseInput.g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(986710170);
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/input/Input$NodeHolder");
        }

        /* renamed from: e */
        public BaseInput d(MUSDKInstance mUSDKInstance, int i, MUSProps mUSProps, MUSProps mUSProps2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BaseInput) ipChange.ipc$dispatch("e25fb3f8", new Object[]{this, mUSDKInstance, new Integer(i), mUSProps, mUSProps2});
            }
            Input input = new Input(i);
            input.setInstance(mUSDKInstance);
            if (mUSProps != null) {
                input.updateStyles(mUSProps);
            }
            if (mUSProps2 != null) {
                input.updateAttrs(mUSProps2);
            }
            return input;
        }
    }

    static {
        t2o.a(986710164);
    }

    public Input(int i) {
        super(i);
    }

    public static /* synthetic */ CharSequence access$000(Input input) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("b6f49a6", new Object[]{input});
        }
        return input.lastValue;
    }

    public static /* synthetic */ CharSequence access$002(Input input, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("9ef6b1c0", new Object[]{input, charSequence});
        }
        input.lastValue = charSequence;
        return charSequence;
    }

    public static /* synthetic */ boolean access$100(Input input) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("764aa099", new Object[]{input})).booleanValue();
        }
        return input.ignoreNextOnInputEvent;
    }

    public static /* synthetic */ boolean access$102(Input input, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5576caa1", new Object[]{input, new Boolean(z)})).booleanValue();
        }
        input.ignoreNextOnInputEvent = z;
        return z;
    }

    public static /* synthetic */ String access$200(Input input) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a0dce9ca", new Object[]{input});
        }
        return input.beforeText;
    }

    public static /* synthetic */ String access$202(Input input, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31edccfe", new Object[]{input, str});
        }
        input.beforeText = str;
        return str;
    }

    public static /* synthetic */ Object ipc$super(Input input, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1680040905:
                return new Integer(super.poolSize());
            case -1470271414:
                super.addEvent((String) objArr[0]);
                return null;
            case -1460428041:
                return super.getNodeType();
            case -379972208:
                return new Boolean(super.isGenerated());
            case -285278287:
                super.onMount((MUSDKInstance) objArr[0], objArr[1]);
                return null;
            case -136526582:
                super.onUnmount((MUSDKInstance) objArr[0], objArr[1]);
                return null;
            case 1023482609:
                super.onDispatchMethod((UINode) objArr[0], (String) objArr[1], (MUSValue[]) objArr[2]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/input/Input");
        }
    }

    @Override // com.taobao.android.weex_uikit.widget.input.BaseInput, tb.hvu
    public /* bridge */ /* synthetic */ UINodeType getNodeType() {
        return super.getNodeType();
    }

    @Override // com.taobao.android.weex_uikit.widget.input.BaseInput, com.taobao.android.weex_uikit.ui.UINode
    public /* bridge */ /* synthetic */ boolean isGenerated() {
        return super.isGenerated();
    }

    @Override // com.taobao.android.weex_uikit.widget.input.BaseInput, com.taobao.android.weex_uikit.ui.UINode
    public /* bridge */ /* synthetic */ void onDispatchMethod(UINode uINode, String str, MUSValue[] mUSValueArr) {
        super.onDispatchMethod(uINode, str, mUSValueArr);
    }

    @Override // com.taobao.android.weex_uikit.widget.input.BaseInput, tb.hvu
    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        super.onMount(mUSDKInstance, obj);
        EditText editText = (EditText) obj;
        editText.addTextChangedListener(this.listenerInfo);
        editText.setOnFocusChangeListener(this.listenerInfo);
        editText.setOnEditorActionListener(this.listenerInfo);
    }

    @Override // com.taobao.android.weex_uikit.widget.input.BaseInput, tb.hvu
    public void onUnmount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dcc50a", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        super.onUnmount(mUSDKInstance, obj);
        EditText editText = (EditText) obj;
        editText.removeTextChangedListener(this.listenerInfo);
        editText.setOnFocusChangeListener(null);
    }

    @Override // com.taobao.android.weex_uikit.widget.input.BaseInput, tb.hvu
    public /* bridge */ /* synthetic */ int poolSize() {
        return super.poolSize();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
        if (r6.equals("return") == false) goto L_0x002a;
     */
    @Override // com.taobao.android.weex_uikit.ui.UINode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void addEvent(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.weex_uikit.widget.input.Input.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0015
            java.lang.String r4 = "a85d704a"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r5
            r2[r0] = r6
            r3.ipc$dispatch(r4, r2)
            return
        L_0x0015:
            super.addEvent(r6)
            boolean r3 = android.text.TextUtils.isEmpty(r6)
            if (r3 == 0) goto L_0x001f
            return
        L_0x001f:
            r6.hashCode()
            r3 = -1
            int r4 = r6.hashCode()
            switch(r4) {
                case -1361636432: goto L_0x0058;
                case -934396624: goto L_0x004e;
                case 3027047: goto L_0x0043;
                case 97604824: goto L_0x0038;
                case 100358090: goto L_0x002c;
                default: goto L_0x002a;
            }
        L_0x002a:
            r0 = -1
            goto L_0x0062
        L_0x002c:
            java.lang.String r0 = "input"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0036
            goto L_0x002a
        L_0x0036:
            r0 = 4
            goto L_0x0062
        L_0x0038:
            java.lang.String r0 = "focus"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0041
            goto L_0x002a
        L_0x0041:
            r0 = 3
            goto L_0x0062
        L_0x0043:
            java.lang.String r0 = "blur"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x004c
            goto L_0x002a
        L_0x004c:
            r0 = 2
            goto L_0x0062
        L_0x004e:
            java.lang.String r1 = "return"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x0062
            goto L_0x002a
        L_0x0058:
            java.lang.String r0 = "change"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0061
            goto L_0x002a
        L_0x0061:
            r0 = 0
        L_0x0062:
            switch(r0) {
                case 0: goto L_0x0087;
                case 1: goto L_0x007c;
                case 2: goto L_0x0071;
                case 3: goto L_0x0071;
                case 4: goto L_0x0066;
                default: goto L_0x0065;
            }
        L_0x0065:
            goto L_0x009b
        L_0x0066:
            com.taobao.android.weex_uikit.widget.input.InputListenerInfo r6 = r5.listenerInfo
            com.taobao.android.weex_uikit.widget.input.Input$b r0 = new com.taobao.android.weex_uikit.widget.input.Input$b
            r0.<init>()
            r6.addTextWatcher(r0)
            goto L_0x009b
        L_0x0071:
            com.taobao.android.weex_uikit.widget.input.InputListenerInfo r6 = r5.listenerInfo
            com.taobao.android.weex_uikit.widget.input.Input$c r0 = new com.taobao.android.weex_uikit.widget.input.Input$c
            r0.<init>()
            r6.addFocusChangeListener(r0)
            goto L_0x009b
        L_0x007c:
            com.taobao.android.weex_uikit.widget.input.InputListenerInfo r6 = r5.listenerInfo
            com.taobao.android.weex_uikit.widget.input.Input$4 r0 = new com.taobao.android.weex_uikit.widget.input.Input$4
            r0.<init>()
            r6.addEditorActionListener(r0)
            goto L_0x009b
        L_0x0087:
            com.taobao.android.weex_uikit.widget.input.InputListenerInfo r6 = r5.listenerInfo
            com.taobao.android.weex_uikit.widget.input.Input$a r0 = new com.taobao.android.weex_uikit.widget.input.Input$a
            r0.<init>()
            r6.addFocusChangeListener(r0)
            com.taobao.android.weex_uikit.widget.input.InputListenerInfo r6 = r5.listenerInfo
            com.taobao.android.weex_uikit.widget.input.Input$2 r0 = new com.taobao.android.weex_uikit.widget.input.Input$2
            r0.<init>()
            r6.addEditorActionListener(r0)
        L_0x009b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_uikit.widget.input.Input.addEvent(java.lang.String):void");
    }
}
