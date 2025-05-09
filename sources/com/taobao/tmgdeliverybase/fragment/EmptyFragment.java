package com.taobao.tmgdeliverybase.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.TBErrorView;
import mtopsdk.mtop.util.ErrorConstant;
import tb.wmc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class EmptyFragment extends Fragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public TBErrorView f13837a;
    public c c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(EmptyFragment emptyFragment) {
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
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
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
            EmptyFragment.this.u2(true);
            if (EmptyFragment.p2(EmptyFragment.this) != null) {
                EmptyFragment.p2(EmptyFragment.this).onRetry();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface c {
        void onRetry();
    }

    public static /* synthetic */ Object ipc$super(EmptyFragment emptyFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1512649357) {
            super.onResume();
            return null;
        } else if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tmgdeliverybase/fragment/EmptyFragment");
        }
    }

    public static /* synthetic */ c p2(EmptyFragment emptyFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("41d73058", new Object[]{emptyFragment});
        }
        return emptyFragment.c;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
        } else {
            super.onCreate(bundle);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(R.layout.fragment_empty, viewGroup, false);
        frameLayout.addView(r2(getContext()));
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        u2(true);
    }

    public final TBErrorView r2(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBErrorView) ipChange.ipc$dispatch("bd2ff8e9", new Object[]{this, context});
        }
        TBErrorView tBErrorView = new TBErrorView(context);
        this.f13837a = tBErrorView;
        tBErrorView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f13837a.setButtonVisibility(TBErrorView.ButtonType.BUTTON_RIGHT, 8);
        this.f13837a.setButtonVisibility(TBErrorView.ButtonType.BUTTON_LEFT, 8);
        return this.f13837a;
    }

    public void s2(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("718c6119", new Object[]{this, cVar});
        } else {
            this.c = cVar;
        }
    }

    public void u2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce469dd7", new Object[]{this, new Boolean(z)});
            return;
        }
        TBErrorView tBErrorView = this.f13837a;
        if (tBErrorView != null) {
            if (z) {
                tBErrorView.setTitle("正在加载中");
                this.f13837a.setSubTitle("请稍后...");
                TBErrorView tBErrorView2 = this.f13837a;
                TBErrorView.ButtonType buttonType = TBErrorView.ButtonType.BUTTON_LEFT;
                tBErrorView2.setButton(buttonType, "加载中", new a(this));
                this.f13837a.setButtonVisibility(buttonType, 4);
                return;
            }
            tBErrorView.setTitle(ErrorConstant.MappingMsg.NETWORK_MAPPING_MSG);
            this.f13837a.setSubTitle("别紧张，试试看刷新页面~");
            TBErrorView tBErrorView3 = this.f13837a;
            TBErrorView.ButtonType buttonType2 = TBErrorView.ButtonType.BUTTON_LEFT;
            tBErrorView3.setButton(buttonType2, wmc.REFRESH, new b());
            this.f13837a.setButtonVisibility(buttonType2, 0);
        }
    }
}
