package tb;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.component.TBErrorView;
import mtopsdk.mtop.util.ErrorConstant;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class pvq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public TBErrorView f26343a;
    public final c b;
    public boolean c = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(pvq pvqVar) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            pvq.this.e(true);
            pvq.a(pvq.this).onRetry();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface c {
        void onRetry();
    }

    static {
        t2o.a(729810111);
    }

    public pvq(c cVar) {
        this.b = cVar;
    }

    public static /* synthetic */ c a(pvq pvqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("9610b5f6", new Object[]{pvqVar});
        }
        return pvqVar.b;
    }

    public final TBErrorView b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBErrorView) ipChange.ipc$dispatch("bd2ff8e9", new Object[]{this, context});
        }
        TBErrorView tBErrorView = new TBErrorView(context);
        this.f26343a = tBErrorView;
        tBErrorView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f26343a.setButtonVisibility(TBErrorView.ButtonType.BUTTON_RIGHT, 8);
        this.f26343a.setButtonVisibility(TBErrorView.ButtonType.BUTTON_LEFT, 8);
        return this.f26343a;
    }

    public View c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d7cc4750", new Object[]{this, context});
        }
        sfh.d("SubscribeDefaultSubTabController", "SubscribeDefaultViewPresenter createSubscribeView isLoading " + this.c);
        this.f26343a = b(context);
        e(this.c);
        return this.f26343a;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e10043d", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce469dd7", new Object[]{this, new Boolean(z)});
            return;
        }
        this.c = z;
        TBErrorView tBErrorView = this.f26343a;
        if (tBErrorView != null) {
            if (z) {
                tBErrorView.setTitle("正在加载中");
                this.f26343a.setSubTitle("请稍后...");
                TBErrorView tBErrorView2 = this.f26343a;
                TBErrorView.ButtonType buttonType = TBErrorView.ButtonType.BUTTON_LEFT;
                tBErrorView2.setButton(buttonType, "加载中", new a(this));
                this.f26343a.setButtonVisibility(buttonType, 4);
                return;
            }
            tBErrorView.setTitle(ErrorConstant.MappingMsg.NETWORK_MAPPING_MSG);
            this.f26343a.setSubTitle("别紧张，试试看刷新页面~");
            TBErrorView tBErrorView3 = this.f26343a;
            TBErrorView.ButtonType buttonType2 = TBErrorView.ButtonType.BUTTON_LEFT;
            tBErrorView3.setButton(buttonType2, wmc.REFRESH, new b());
            this.f26343a.setButtonVisibility(buttonType2, 0);
        }
    }
}
