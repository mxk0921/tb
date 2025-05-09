package com.alibaba.android.icart.core.event;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.recycler.RecyclerAdapter;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.xsearchplugin.muise.SFMuiseSDK;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.fdv;
import tb.fxo;
import tb.gsb;
import tb.juv;
import tb.kmb;
import tb.lcu;
import tb.lmb;
import tb.ml1;
import tb.na3;
import tb.pb6;
import tb.sca;
import tb.t2o;
import tb.ua3;
import tb.vo0;
import tb.zxb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ItemOperationSubscriber extends lmb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final List<ItemOperate> l = new ArrayList(Arrays.asList(new ItemOperate(Localization.q(R.string.app_find_same_version), "findTheSameClick"), new ItemOperate(Localization.q(R.string.app_find_similar), "similarClick"), new ItemOperate(Localization.q(R.string.app_favorite), "addfavorClick"), new ItemOperate(Localization.q(R.string.app_delete), "deleteClick")));

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class ItemOperate implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String event;
        public String text;

        static {
            t2o.a(479199444);
        }

        public ItemOperate() {
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "ItemOperate{text='" + this.text + "', event='" + this.event + "'}";
        }

        public ItemOperate(String str, String str2) {
            this.text = str;
            this.event = str2;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements DialogInterface.OnDismissListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
            } else {
                ItemOperationSubscriber.A(ItemOperationSubscriber.this).B().U(false);
            }
        }
    }

    public static /* synthetic */ zxb A(ItemOperationSubscriber itemOperationSubscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zxb) ipChange.ipc$dispatch("b100ceae", new Object[]{itemOperationSubscriber});
        }
        return itemOperationSubscriber.k;
    }

    public static /* synthetic */ Context B(ItemOperationSubscriber itemOperationSubscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("8a1c5942", new Object[]{itemOperationSubscriber});
        }
        return itemOperationSubscriber.b;
    }

    public static /* synthetic */ Context C(ItemOperationSubscriber itemOperationSubscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("6fc7b5c3", new Object[]{itemOperationSubscriber});
        }
        return itemOperationSubscriber.b;
    }

    public static /* synthetic */ IDMComponent D(ItemOperationSubscriber itemOperationSubscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("436f6550", new Object[]{itemOperationSubscriber});
        }
        return itemOperationSubscriber.e;
    }

    public static /* synthetic */ IDMComponent E(ItemOperationSubscriber itemOperationSubscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("d1fae651", new Object[]{itemOperationSubscriber});
        }
        return itemOperationSubscriber.e;
    }

    public static /* synthetic */ kmb F(ItemOperationSubscriber itemOperationSubscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("e8921f17", new Object[]{itemOperationSubscriber});
        }
        return itemOperationSubscriber.j;
    }

    public static /* synthetic */ IDMComponent G(ItemOperationSubscriber itemOperationSubscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("ef11e853", new Object[]{itemOperationSubscriber});
        }
        return itemOperationSubscriber.e;
    }

    public static /* synthetic */ kmb H(ItemOperationSubscriber itemOperationSubscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("5b8b4a99", new Object[]{itemOperationSubscriber});
        }
        return itemOperationSubscriber.j;
    }

    public static /* synthetic */ kmb I(ItemOperationSubscriber itemOperationSubscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("1507e05a", new Object[]{itemOperationSubscriber});
        }
        return itemOperationSubscriber.j;
    }

    public static /* synthetic */ Object ipc$super(ItemOperationSubscriber itemOperationSubscriber, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/event/ItemOperationSubscriber");
    }

    public static /* synthetic */ Context p(ItemOperationSubscriber itemOperationSubscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("bec5a040", new Object[]{itemOperationSubscriber});
        }
        return itemOperationSubscriber.b;
    }

    public static /* synthetic */ Context q(ItemOperationSubscriber itemOperationSubscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("a470fcc1", new Object[]{itemOperationSubscriber});
        }
        return itemOperationSubscriber.b;
    }

    public static /* synthetic */ IDMComponent r(ItemOperationSubscriber itemOperationSubscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("69d88cbb", new Object[]{itemOperationSubscriber});
        }
        return itemOperationSubscriber.e;
    }

    public static /* synthetic */ kmb s(ItemOperationSubscriber itemOperationSubscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("879f5d01", new Object[]{itemOperationSubscriber});
        }
        return itemOperationSubscriber.j;
    }

    public static /* synthetic */ kmb t(ItemOperationSubscriber itemOperationSubscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("411bf2c2", new Object[]{itemOperationSubscriber});
        }
        return itemOperationSubscriber.j;
    }

    public static /* synthetic */ IDMComponent u(ItemOperationSubscriber itemOperationSubscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("157b0fbe", new Object[]{itemOperationSubscriber});
        }
        return itemOperationSubscriber.e;
    }

    public static /* synthetic */ kmb v(ItemOperationSubscriber itemOperationSubscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("b4151e44", new Object[]{itemOperationSubscriber});
        }
        return itemOperationSubscriber.j;
    }

    public static /* synthetic */ IDMComponent w(ItemOperationSubscriber itemOperationSubscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("329211c0", new Object[]{itemOperationSubscriber});
        }
        return itemOperationSubscriber.e;
    }

    public static /* synthetic */ kmb x(ItemOperationSubscriber itemOperationSubscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("270e49c6", new Object[]{itemOperationSubscriber});
        }
        return itemOperationSubscriber.j;
    }

    public static /* synthetic */ IDMComponent y(ItemOperationSubscriber itemOperationSubscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("4fa913c2", new Object[]{itemOperationSubscriber});
        }
        return itemOperationSubscriber.e;
    }

    public static /* synthetic */ kmb z(ItemOperationSubscriber itemOperationSubscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("9a077548", new Object[]{itemOperationSubscriber});
        }
        return itemOperationSubscriber.j;
    }

    public final ArrayList<ItemOperate> J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("5f36ecf9", new Object[]{this});
        }
        JSONArray o = sca.o(this.e, this.j);
        if (o.isEmpty()) {
            ArrayList<ItemOperate> arrayList = new ArrayList<>();
            Iterator it = ((ArrayList) l).iterator();
            while (it.hasNext()) {
                ItemOperate itemOperate = (ItemOperate) it.next();
                if (this.e.getEventMap().containsKey(itemOperate.event)) {
                    arrayList.add(itemOperate);
                }
            }
            return arrayList;
        }
        ArrayList<ItemOperate> arrayList2 = new ArrayList<>();
        Iterator<Object> it2 = o.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (next instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) next;
                ItemOperate itemOperate2 = new ItemOperate();
                String string = jSONObject.getString("event");
                itemOperate2.event = string;
                if (!"shareClick".equals(string)) {
                    itemOperate2.text = jSONObject.getString("text");
                    arrayList2.add(itemOperate2);
                }
            }
        }
        return arrayList2;
    }

    @Override // tb.l12
    public void j(final lcu lcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
            return;
        }
        fdv.d(lcuVar);
        if (this.e != null) {
            b();
            final Dialog dialog = new Dialog(this.b, R.style.ItemOperateDialog);
            RecyclerView recyclerView = new RecyclerView(this.b);
            DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this.b, 1);
            dividerItemDecoration.setDrawable(this.b.getResources().getDrawable(R.drawable.icart_operate_divider));
            recyclerView.addItemDecoration(dividerItemDecoration);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.b);
            linearLayoutManager.setOrientation(1);
            recyclerView.setLayoutManager(linearLayoutManager);
            dialog.setContentView(recyclerView);
            final ArrayList<ItemOperate> J = J();
            ua3.b(J);
            recyclerView.setAdapter(new RecyclerView.Adapter() { // from class: com.alibaba.android.icart.core.event.ItemOperationSubscriber.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* compiled from: Taobao */
                /* renamed from: com.alibaba.android.icart.core.event.ItemOperationSubscriber$1$a */
                /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
                public class a implements View.OnClickListener {
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* renamed from: a  reason: collision with root package name */
                    public final /* synthetic */ ItemOperate f2206a;

                    public a(ItemOperate itemOperate) {
                        this.f2206a = itemOperate;
                    }

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        Object obj;
                        List<gsb> list;
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            return;
                        }
                        lcu lcuVar = lcuVar;
                        View view2 = null;
                        if (lcuVar == null) {
                            obj = null;
                        } else {
                            obj = lcuVar.e(na3.sKeyEventExtraCartItemView);
                        }
                        Context C = ItemOperationSubscriber.C(ItemOperationSubscriber.this);
                        String str = this.f2206a.event;
                        IDMComponent D = ItemOperationSubscriber.D(ItemOperationSubscriber.this);
                        if (obj instanceof View) {
                            view2 = (View) obj;
                        }
                        if (!ua3.a(C, str, D, view2) && (list = ItemOperationSubscriber.E(ItemOperationSubscriber.this).getEventMap().get(this.f2206a.event)) != null && !list.isEmpty()) {
                            for (gsb gsbVar : list) {
                                lcu d = ItemOperationSubscriber.F(ItemOperationSubscriber.this).g().d();
                                d.l(gsbVar.getType());
                                d.i(ItemOperationSubscriber.G(ItemOperationSubscriber.this));
                                d.q(this.f2206a.event);
                                d.k(gsbVar);
                                ItemOperationSubscriber.H(ItemOperationSubscriber.this).g().h(d);
                            }
                            dialog.dismiss();
                            if (this.f2206a.event.equals("deleteClick")) {
                                juv.a(ItemOperationSubscriber.I(ItemOperationSubscriber.this), "Page_ShoppingCart_Item_Delete", vo0.b(ItemOperationSubscriber.r(ItemOperationSubscriber.this), ItemOperationSubscriber.s(ItemOperationSubscriber.this), new String[0]));
                            } else if (this.f2206a.event.equals("addfavorClick")) {
                                juv.a(ItemOperationSubscriber.t(ItemOperationSubscriber.this), "Page_ShoppingCart_Item_AddFavor", vo0.b(ItemOperationSubscriber.u(ItemOperationSubscriber.this), ItemOperationSubscriber.v(ItemOperationSubscriber.this), new String[0]));
                            }
                            Map<String, String> b = vo0.b(ItemOperationSubscriber.w(ItemOperationSubscriber.this), ItemOperationSubscriber.x(ItemOperationSubscriber.this), new String[0]);
                            b.put(SFMuiseSDK.MUISE_BUNDLE_TYPE, ml1.m(ItemOperationSubscriber.y(ItemOperationSubscriber.this)));
                            juv.a(ItemOperationSubscriber.z(ItemOperationSubscriber.this), "Page_ShoppingCart_ItemLongClick_" + this.f2206a.event, b);
                        }
                    }
                }

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/event/ItemOperationSubscriber$1");
                }

                @Override // androidx.recyclerview.widget.RecyclerView.Adapter
                public int getItemCount() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
                    }
                    return J.size();
                }

                @Override // androidx.recyclerview.widget.RecyclerView.Adapter
                public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                    String str;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("aa17accb", new Object[]{this, viewHolder, new Integer(i)});
                        return;
                    }
                    View view = viewHolder.itemView;
                    ItemOperate itemOperate = (ItemOperate) J.get(i);
                    TextView textView = (TextView) view.findViewById(R.id.cart_item_operate_button);
                    textView.setText(itemOperate.text);
                    if (itemOperate.event.equals("deleteClick")) {
                        str = "#FF5500";
                    } else {
                        str = "#333333";
                    }
                    textView.setTextColor(Color.parseColor(str));
                    ViewProxy.setOnClickListener(view, new a(itemOperate));
                }

                @Override // androidx.recyclerview.widget.RecyclerView.Adapter
                public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (RecyclerView.ViewHolder) ipChange2.ipc$dispatch("9e3c0169", new Object[]{this, viewGroup, new Integer(i)});
                    }
                    View inflate = LayoutInflater.from(ItemOperationSubscriber.p(ItemOperationSubscriber.this)).inflate(R.layout.icart_dialog_item_operate_button, viewGroup, false);
                    inflate.setLayoutParams(new ViewGroup.LayoutParams((int) fxo.c(ItemOperationSubscriber.q(ItemOperationSubscriber.this)), pb6.f(ItemOperationSubscriber.B(ItemOperationSubscriber.this), 44.0f)));
                    return new RecyclerAdapter.ItemViewHolder(inflate);
                }
            });
            dialog.show();
            dialog.setOnDismissListener(new a());
            this.k.B().U(true);
            kmb kmbVar = this.j;
            juv.a(kmbVar, "Page_ShoppingCart_Item_OpenOperate", vo0.b(this.e, kmbVar, new String[0]));
        }
    }

    static {
        t2o.a(479199440);
    }
}
