package com.taobao.themis.open.permission.auth.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.open.permission.auth.model.AuthTextModel;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.uikit.feature.features.RoundFeature;
import java.util.List;
import kotlin.Metadata;
import tb.ckf;
import tb.d7h;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/taobao/themis/open/permission/auth/ui/SingleAuthAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/taobao/themis/open/permission/auth/ui/SingleAuthAdapter$BaseViewHolder;", "BaseViewHolder", "themis_open_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class SingleAuthAdapter extends RecyclerView.Adapter<BaseViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<AuthTextModel> f13677a;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/taobao/themis/open/permission/auth/ui/SingleAuthAdapter$BaseViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "themis_open_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class BaseViewHolder extends RecyclerView.ViewHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final TextView f13678a;
        public final TextView b;
        public final RelativeLayout c;
        public final RelativeLayout d;
        public final TUrlImageView e;
        public final TextView f;
        public final TextView g;

        static {
            t2o.a(843055374);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BaseViewHolder(View view) {
            super(view);
            ckf.g(view, "view");
            View findViewById = view.findViewById(R.id.tv_auth_title);
            ckf.f(findViewById, "view.findViewById(R.id.tv_auth_title)");
            this.f13678a = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.tv_auth_content);
            ckf.f(findViewById2, "view.findViewById(R.id.tv_auth_content)");
            this.b = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.layout_avatar);
            ckf.f(findViewById3, "view.findViewById(R.id.layout_avatar)");
            this.c = (RelativeLayout) findViewById3;
            View findViewById4 = view.findViewById(R.id.layout_phone);
            ckf.f(findViewById4, "view.findViewById(R.id.layout_phone)");
            this.d = (RelativeLayout) findViewById4;
            View findViewById5 = view.findViewById(R.id.iv_user_info_avatar);
            ckf.f(findViewById5, "view.findViewById(R.id.iv_user_info_avatar)");
            this.e = (TUrlImageView) findViewById5;
            View findViewById6 = view.findViewById(R.id.iv_user_info_nick);
            ckf.f(findViewById6, "view.findViewById(R.id.iv_user_info_nick)");
            this.f = (TextView) findViewById6;
            View findViewById7 = view.findViewById(R.id.phone_number);
            ckf.f(findViewById7, "view.findViewById(R.id.phone_number)");
            this.g = (TextView) findViewById7;
        }

        public static /* synthetic */ Object ipc$super(BaseViewHolder baseViewHolder, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/open/permission/auth/ui/SingleAuthAdapter$BaseViewHolder");
        }

        public final RelativeLayout b0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RelativeLayout) ipChange.ipc$dispatch("b18ad044", new Object[]{this});
            }
            return this.d;
        }

        public final RelativeLayout c0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RelativeLayout) ipChange.ipc$dispatch("a4a56583", new Object[]{this});
            }
            return this.c;
        }

        public final TextView d0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TextView) ipChange.ipc$dispatch("dda262f9", new Object[]{this});
            }
            return this.g;
        }

        public final TUrlImageView e0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TUrlImageView) ipChange.ipc$dispatch("e636d19a", new Object[]{this});
            }
            return this.e;
        }

        public final TextView f0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TextView) ipChange.ipc$dispatch("11f04120", new Object[]{this});
            }
            return this.f;
        }

        public final TextView g0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TextView) ipChange.ipc$dispatch("c9786a94", new Object[]{this});
            }
            return this.b;
        }

        public final TextView h0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TextView) ipChange.ipc$dispatch("de9348bb", new Object[]{this});
            }
            return this.f13678a;
        }
    }

    static {
        t2o.a(843055373);
    }

    public SingleAuthAdapter(List<AuthTextModel> list) {
        ckf.g(list, "authTextList");
        this.f13677a = list;
    }

    public static /* synthetic */ Object ipc$super(SingleAuthAdapter singleAuthAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/open/permission/auth/ui/SingleAuthAdapter");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        return this.f13677a.size();
    }

    /* renamed from: M */
    public void onBindViewHolder(BaseViewHolder baseViewHolder, int i) {
        String string;
        String string2;
        String string3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5be80ac", new Object[]{this, baseViewHolder, new Integer(i)});
            return;
        }
        ckf.g(baseViewHolder, "holder");
        AuthTextModel authTextModel = this.f13677a.get(i);
        baseViewHolder.h0().setText(authTextModel.getAuthText());
        baseViewHolder.g0().setText(authTextModel.getAuthSceneDesc());
        if (ckf.b(d7h.CONST_SCOPE_USERINFO, authTextModel.getScopeName())) {
            if (authTextModel.getAuthInfo() != null) {
                baseViewHolder.c0().setVisibility(0);
                JSONObject authInfo = authTextModel.getAuthInfo();
                if (!(authInfo == null || (string3 = authInfo.getString("userAvatar")) == null)) {
                    baseViewHolder.e0().addFeature(new RoundFeature());
                    baseViewHolder.e0().setImageUrl(string3);
                }
                JSONObject authInfo2 = authTextModel.getAuthInfo();
                if (!(authInfo2 == null || (string2 = authInfo2.getString("userFuzzNick")) == null)) {
                    baseViewHolder.f0().setText(string2);
                }
            } else {
                baseViewHolder.c0().setVisibility(8);
            }
        }
        if (ckf.b("scope.getPhoneNumber", authTextModel.getScopeName())) {
            JSONObject authInfo3 = authTextModel.getAuthInfo();
            xhv xhvVar = null;
            if (!(authInfo3 == null || (string = authInfo3.getString("userFuzzMobilePhone")) == null)) {
                baseViewHolder.b0().setVisibility(0);
                baseViewHolder.d0().setText(string);
                xhvVar = xhv.INSTANCE;
            }
            if (xhvVar == null) {
                baseViewHolder.b0().setVisibility(8);
            }
        }
    }

    /* renamed from: N */
    public BaseViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseViewHolder) ipChange.ipc$dispatch("8e53dea8", new Object[]{this, viewGroup, new Integer(i)});
        }
        ckf.g(viewGroup, a.MSG_SOURCE_PARENT);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tms_auth_dialog_single_item, viewGroup, false);
        ckf.f(inflate, "from(parent.context)\n   …ngle_item, parent, false)");
        return new BaseViewHolder(inflate);
    }
}
