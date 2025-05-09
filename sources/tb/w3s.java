package tb;

import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class w3s extends Dialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public TextView f30435a;
    public TextView b;
    public TextView c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                w3s.this.dismiss();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View.OnClickListener f30437a;

        public b(View.OnClickListener onClickListener) {
            this.f30437a = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            View.OnClickListener onClickListener = this.f30437a;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            w3s.this.dismiss();
        }
    }

    static {
        t2o.a(806355797);
    }

    public w3s(Context context) {
        this(context, R.style.TLLive_Permission_Dialog);
    }

    public static String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c71d0fc5", new Object[]{str});
        }
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (c == 12288) {
                charArray[i] = ' ';
            } else if (c > 65280 && c < 65375) {
                charArray[i] = (char) (c - 65248);
            }
        }
        return new String(charArray);
    }

    public static /* synthetic */ Object ipc$super(w3s w3sVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/ui/common/TLivePromptDialog");
    }

    public final void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.taolive_base_prompt_dialog, (ViewGroup) null);
        setContentView(inflate);
        this.f30435a = (TextView) inflate.findViewById(R.id.title);
        this.b = (TextView) inflate.findViewById(R.id.content);
        this.c = (TextView) inflate.findViewById(R.id.positive);
        ViewProxy.setOnClickListener(inflate.findViewById(R.id.taolive_close), new a());
    }

    public w3s b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w3s) ipChange.ipc$dispatch("62d62cf6", new Object[]{this, str});
        }
        this.b.setText(e(str));
        return this;
    }

    public w3s c(String str, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w3s) ipChange.ipc$dispatch("dda62189", new Object[]{this, str, onClickListener});
        }
        this.c.setVisibility(0);
        this.c.setText(str);
        this.c.setOnClickListener(new b(onClickListener));
        return this;
    }

    public w3s d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w3s) ipChange.ipc$dispatch("a1efef95", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            this.f30435a.setVisibility(0);
            this.f30435a.setText(str);
        }
        return this;
    }

    public w3s(Context context, int i) {
        super(context, i);
        a(context);
    }
}
