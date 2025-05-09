package com.taobao.android.icart.weex.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.recycler.RecyclerAdapter;
import com.taobao.android.icart.weex.dialog.ItemOperateDialog;
import com.taobao.taobao.R;
import java.util.List;
import tb.ckf;
import tb.f7l;
import tb.fxo;
import tb.g1a;
import tb.pb6;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class ItemOperateDialog extends Dialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Activity f8048a;
    public final List<a> b;
    public final g1a<a, xhv> c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f8049a;
        public final String b;
        public final String c;

        static {
            t2o.a(478150982);
        }

        public a(String str, String str2, String str3) {
            ckf.g(str, "text");
            ckf.g(str2, "textColor");
            ckf.g(str3, "event");
            this.f8049a = str;
            this.b = str2;
            this.c = str3;
        }

        public final String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2004c95", new Object[]{this});
            }
            return this.c;
        }

        public final String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("97297536", new Object[]{this});
            }
            return this.f8049a;
        }

        public final String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1e093f79", new Object[]{this});
            }
            return this.b;
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (!ckf.b(this.f8049a, aVar.f8049a) || !ckf.b(this.b, aVar.b) || !ckf.b(this.c, aVar.c)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            String str = this.f8049a;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i4 = i * 31;
            String str2 = this.b;
            if (str2 != null) {
                i2 = str2.hashCode();
            } else {
                i2 = 0;
            }
            int i5 = (i4 + i2) * 31;
            String str3 = this.c;
            if (str3 != null) {
                i3 = str3.hashCode();
            }
            return i5 + i3;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "OperateItem(text=" + this.f8049a + ", textColor=" + this.b + ", event=" + this.c + f7l.BRACKET_END_STR;
        }
    }

    static {
        t2o.a(478150981);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ItemOperateDialog(Activity activity, List<a> list, g1a<? super a, xhv> g1aVar) {
        super(activity, R.style.ItemOperateDialog);
        ckf.g(activity, "context");
        ckf.g(list, "operateItems");
        ckf.g(g1aVar, "clickListener");
        this.f8048a = activity;
        this.b = list;
        this.c = g1aVar;
    }

    public static /* synthetic */ Object ipc$super(ItemOperateDialog itemOperateDialog, String str, Object... objArr) {
        if (str.hashCode() == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/weex/dialog/ItemOperateDialog");
    }

    public final g1a<a, xhv> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("f0bf48f", new Object[]{this});
        }
        return this.c;
    }

    public final Activity b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("616f3928", new Object[]{this});
        }
        return this.f8048a;
    }

    public final List<a> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("88a22e8e", new Object[]{this});
        }
        return this.b;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        RecyclerView recyclerView = new RecyclerView(this.f8048a);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this.f8048a, 1);
        dividerItemDecoration.setDrawable(this.f8048a.getResources().getDrawable(R.drawable.icart_operate_divider));
        recyclerView.addItemDecoration(dividerItemDecoration);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f8048a);
        linearLayoutManager.setOrientation(1);
        recyclerView.setLayoutManager(linearLayoutManager);
        setContentView(recyclerView);
        recyclerView.setAdapter(new RecyclerView.Adapter<RecyclerView.ViewHolder>() { // from class: com.taobao.android.icart.weex.dialog.ItemOperateDialog$onCreate$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* compiled from: Taobao */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
            public static final class a implements View.OnClickListener {
                public static volatile transient /* synthetic */ IpChange $ipChange;
                public final /* synthetic */ ItemOperateDialog.a b;

                public a(ItemOperateDialog.a aVar) {
                    this.b = aVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    ItemOperateDialog.this.a().invoke(this.b);
                    ItemOperateDialog.this.dismiss();
                }
            }

            public static /* synthetic */ Object ipc$super(ItemOperateDialog$onCreate$1 itemOperateDialog$onCreate$1, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/weex/dialog/ItemOperateDialog$onCreate$1");
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public int getItemCount() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
                }
                return ItemOperateDialog.this.c().size();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                KeyEvent.Callback callback;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("aa17accb", new Object[]{this, viewHolder, new Integer(i)});
                    return;
                }
                ItemOperateDialog.a aVar = ItemOperateDialog.this.c().get(i);
                KeyEvent.Callback callback2 = null;
                if (viewHolder != null) {
                    callback = viewHolder.itemView;
                } else {
                    callback = null;
                }
                if (callback instanceof TextView) {
                    callback2 = callback;
                }
                TextView textView = (TextView) callback2;
                if (textView != null) {
                    textView.setOnClickListener(new a(aVar));
                }
                if (textView != null) {
                    textView.setText(aVar.b());
                }
                if (textView != null) {
                    textView.setTextColor(Color.parseColor(aVar.c()));
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (RecyclerView.ViewHolder) ipChange2.ipc$dispatch("9e3c0169", new Object[]{this, viewGroup, new Integer(i)});
                }
                ckf.g(viewGroup, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
                View inflate = LayoutInflater.from(ItemOperateDialog.this.b()).inflate(R.layout.icart_dialog_item_operate_button, viewGroup, false);
                ckf.f(inflate, "item");
                inflate.setLayoutParams(new ViewGroup.LayoutParams((int) fxo.c(ItemOperateDialog.this.b()), pb6.f(ItemOperateDialog.this.b(), 44.0f)));
                return new RecyclerAdapter.ItemViewHolder(inflate);
            }
        });
    }
}
