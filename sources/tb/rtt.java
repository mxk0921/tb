package tb;

import android.widget.EditText;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.UINode;
import tb.lu6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class rtt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements lu6.f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ EditText f27606a;
        public final /* synthetic */ UINode b;

        public a(EditText editText, UINode uINode) {
            this.f27606a = editText;
            this.b = uINode;
        }

        @Override // tb.lu6.f
        public void onPick(boolean z, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fcc46917", new Object[]{this, new Boolean(z), str});
            } else if (z) {
                this.f27606a.setText(str);
                rtt.a(this.b, str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements lu6.f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ EditText f27607a;
        public final /* synthetic */ UINode b;

        public b(EditText editText, UINode uINode) {
            this.f27607a = editText;
            this.b = uINode;
        }

        @Override // tb.lu6.f
        public void onPick(boolean z, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fcc46917", new Object[]{this, new Boolean(z), str});
            } else if (z) {
                this.f27607a.setText(str);
                rtt.a(this.b, str);
            }
        }
    }

    static {
        t2o.a(986710181);
    }

    public static /* synthetic */ void a(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7be60a7b", new Object[]{uINode, str});
        } else {
            b(uINode, str);
        }
    }

    public static void b(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4a5007b", new Object[]{uINode, str});
        } else if (uINode.hasEvent("change")) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("value", (Object) str);
            uINode.fireEvent("change", jSONObject);
        }
    }

    public static void c(String str, String str2, UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8afde13e", new Object[]{str, str2, uINode});
            return;
        }
        EditText editText = (EditText) uINode.getMountContent();
        if (editText != null) {
            lu6.c(editText.getContext(), editText.getText().toString(), str, str2, new a(editText, uINode), null);
        }
    }

    public static void d(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a2bd013", new Object[]{uINode});
            return;
        }
        EditText editText = (EditText) uINode.getMountContent();
        if (editText != null) {
            lu6.d(editText.getContext(), editText.getText().toString(), new b(editText, uINode), null);
        }
    }
}
