package com.taobao.themis.open.permission.auth.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.open.permission.auth.model.DomainItemEntity;
import com.taobao.themis.open.permission.auth.model.ResourceItemEntity;
import com.taobao.themis.open.permission.auth.model.ScopeEntity;
import com.taobao.themis.open.permission.auth.model.ScopeSettingEntity;
import java.util.List;
import kotlin.Metadata;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/open/permission/auth/ui/ScopeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/taobao/themis/open/permission/auth/ui/ScopeAdapter$BaseViewHolder;", "BaseViewHolder", "a", "themis_open_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ScopeAdapter extends RecyclerView.Adapter<BaseViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<ScopeSettingEntity> f13672a;
    public final a b;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/taobao/themis/open/permission/auth/ui/ScopeAdapter$BaseViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "themis_open_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class BaseViewHolder extends RecyclerView.ViewHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final TextView f13673a;
        public final LinearLayout b;

        static {
            t2o.a(843055368);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BaseViewHolder(View view) {
            super(view);
            ckf.g(view, "view");
            View findViewById = view.findViewById(R.id.setting_desc);
            ckf.f(findViewById, "view.findViewById(R.id.setting_desc)");
            this.f13673a = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.layout_scope);
            ckf.f(findViewById2, "view.findViewById(R.id.layout_scope)");
            this.b = (LinearLayout) findViewById2;
        }

        public static /* synthetic */ Object ipc$super(BaseViewHolder baseViewHolder, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/open/permission/auth/ui/ScopeAdapter$BaseViewHolder");
        }

        public final LinearLayout b0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LinearLayout) ipChange.ipc$dispatch("441153c5", new Object[]{this});
            }
            return this.b;
        }

        public final TextView c0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TextView) ipChange.ipc$dispatch("de9348bb", new Object[]{this});
            }
            return this.f13673a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
        void a(int i, int i2);

        void g(int i, int i2, int i3);

        void h(int i, int i2);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ BaseViewHolder b;
        public final /* synthetic */ int c;

        public b(BaseViewHolder baseViewHolder, int i) {
            this.b = baseViewHolder;
            this.c = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                ScopeAdapter.M(ScopeAdapter.this).h(this.b.getAdapterPosition(), this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ BaseViewHolder b;
        public final /* synthetic */ int c;

        public c(BaseViewHolder baseViewHolder, int i) {
            this.b = baseViewHolder;
            this.c = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                ScopeAdapter.M(ScopeAdapter.this).a(this.b.getAdapterPosition(), this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ BaseViewHolder b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;

        public d(BaseViewHolder baseViewHolder, int i, int i2) {
            this.b = baseViewHolder;
            this.c = i;
            this.d = i2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            a M = ScopeAdapter.M(ScopeAdapter.this);
            if (M != null) {
                M.g(this.b.getAdapterPosition(), this.c, this.d);
            }
        }
    }

    static {
        t2o.a(843055367);
    }

    public ScopeAdapter(List<ScopeSettingEntity> list, a aVar) {
        ckf.g(list, "entityList");
        ckf.g(aVar, "scopeClickListener");
        this.f13672a = list;
        this.b = aVar;
    }

    public static final /* synthetic */ a M(ScopeAdapter scopeAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("9a7cb525", new Object[]{scopeAdapter});
        }
        return scopeAdapter.b;
    }

    public static /* synthetic */ Object ipc$super(ScopeAdapter scopeAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/open/permission/auth/ui/ScopeAdapter");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        return this.f13672a.size();
    }

    /* renamed from: O */
    public BaseViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseViewHolder) ipChange.ipc$dispatch("3b6cecfc", new Object[]{this, viewGroup, new Integer(i)});
        }
        ckf.g(viewGroup, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tms_view_authorize_item_scope, viewGroup, false);
        ckf.f(inflate, "from(parent.context)\n   …tem_scope, parent, false)");
        return new BaseViewHolder(inflate);
    }

    /* renamed from: N */
    public void onBindViewHolder(BaseViewHolder baseViewHolder, int i) {
        List<DomainItemEntity> domainItems;
        boolean z = false;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40d3691c", new Object[]{this, baseViewHolder, new Integer(i)});
            return;
        }
        ckf.g(baseViewHolder, "holder");
        ScopeSettingEntity scopeSettingEntity = this.f13672a.get(i);
        if (ckf.b("top", scopeSettingEntity.getType()) || ckf.b("platform", scopeSettingEntity.getType())) {
            baseViewHolder.c0().setText(scopeSettingEntity.getTitle());
            baseViewHolder.b0().removeAllViews();
            List<ScopeEntity> scopes = scopeSettingEntity.getScopes();
            if (scopes != null && (!scopes.isEmpty())) {
                List<ScopeEntity> scopes2 = scopeSettingEntity.getScopes();
                ckf.d(scopes2);
                int size = scopes2.size();
                int i2 = 0;
                while (i2 < size) {
                    i2++;
                    View inflate = LayoutInflater.from(baseViewHolder.b0().getContext()).inflate(R.layout.tms_view_authorize_item, (ViewGroup) baseViewHolder.b0(), false);
                    ckf.f(inflate, "from(holder.mScopeLayout…lder.mScopeLayout, false)");
                    ImageView imageView = (ImageView) inflate.findViewById(R.id.tms_switch_view);
                    List<ScopeEntity> scopes3 = scopeSettingEntity.getScopes();
                    ckf.d(scopes3);
                    ((TextView) inflate.findViewById(R.id.tms_scope_name)).setText(scopes3.get(i2).getDisplayName());
                    baseViewHolder.b0().addView(inflate);
                    imageView.setOnClickListener(new b(baseViewHolder, i2));
                    List<ScopeEntity> scopes4 = scopeSettingEntity.getScopes();
                    ckf.d(scopes4);
                    if (scopes4.get(i2).getStatus()) {
                        imageView.setImageResource(R.drawable.tms_authorize_set_on);
                    } else {
                        imageView.setImageResource(R.drawable.tms_authorize_set_off);
                    }
                }
            }
        } else if (ckf.b("resource", scopeSettingEntity.getType()) && (domainItems = scopeSettingEntity.getDomainItems()) != null && (!domainItems.isEmpty())) {
            List<DomainItemEntity> domainItems2 = scopeSettingEntity.getDomainItems();
            ckf.d(domainItems2);
            int size2 = domainItems2.size();
            int i3 = 0;
            while (i3 < size2) {
                i3++;
                List<DomainItemEntity> domainItems3 = scopeSettingEntity.getDomainItems();
                ckf.d(domainItems3);
                DomainItemEntity domainItemEntity = domainItems3.get(i3);
                baseViewHolder.c0().setText(domainItemEntity.getTipLabel());
                View inflate2 = LayoutInflater.from(baseViewHolder.b0().getContext()).inflate(R.layout.tms_view_authorize_item_domain, baseViewHolder.b0(), z);
                ckf.f(inflate2, "from(holder.mScopeLayout…                        )");
                ImageView imageView2 = (ImageView) inflate2.findViewById(R.id.tms_switch_view);
                ((TextView) inflate2.findViewById(R.id.tms_scope_name)).setText(domainItemEntity.getDomainName());
                baseViewHolder.b0().removeAllViews();
                baseViewHolder.b0().addView(inflate2);
                if (domainItemEntity.isAuthed()) {
                    imageView2.setImageResource(R.drawable.tms_authorize_set_on);
                } else {
                    imageView2.setImageResource(R.drawable.tms_authorize_set_off);
                }
                imageView2.setOnClickListener(new c(baseViewHolder, i3));
                LinearLayout linearLayout = (LinearLayout) inflate2.findViewById(R.id.layout_resource);
                int i4 = z ? 1 : 0;
                int i5 = z ? 1 : 0;
                int i6 = z ? 1 : 0;
                int i7 = z ? 1 : 0;
                linearLayout.setVisibility(i4);
                linearLayout.removeAllViews();
                int i8 = 8;
                if (domainItemEntity.isAuthed()) {
                    List<ResourceItemEntity> resourceItems = domainItemEntity.getResourceItems();
                    if (resourceItems != null && (resourceItems.isEmpty() ^ z2) == z2) {
                        List<ResourceItemEntity> resourceItems2 = domainItemEntity.getResourceItems();
                        ckf.d(resourceItems2);
                        int size3 = resourceItems2.size();
                        int i9 = 0;
                        while (i9 < size3) {
                            i9++;
                            List<ResourceItemEntity> resourceItems3 = domainItemEntity.getResourceItems();
                            ckf.d(resourceItems3);
                            ResourceItemEntity resourceItemEntity = resourceItems3.get(i9);
                            View inflate3 = LayoutInflater.from(linearLayout.getContext()).inflate(R.layout.tms_view_subscribe_item, linearLayout, z);
                            ckf.f(inflate3, "from(mResourceLayout.con…                        )");
                            inflate3.findViewById(R.id.tms_top_split).setVisibility(i8);
                            ImageView imageView3 = (ImageView) inflate3.findViewById(R.id.tms_switch_view);
                            imageView3.setOnClickListener(new d(baseViewHolder, i3, i9));
                            ((TextView) inflate3.findViewById(R.id.tms_subscribe_name)).setText(resourceItemEntity.getName());
                            if (resourceItemEntity.isAuthed()) {
                                imageView3.setImageResource(R.drawable.tms_subscribe_auth_check);
                            } else {
                                imageView3.setImageResource(R.drawable.tms_subscribe_auth_uncheck);
                            }
                            linearLayout.addView(inflate3);
                            z = false;
                            i8 = 8;
                        }
                    }
                } else {
                    linearLayout.setVisibility(8);
                }
                z = false;
                z2 = true;
            }
        }
    }
}
