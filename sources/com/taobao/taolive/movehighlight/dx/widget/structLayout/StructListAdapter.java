package com.taobao.taolive.movehighlight.dx.widget.structLayout;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
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
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import java.util.List;
import tb.n0e;
import tb.sbu;
import tb.t2o;
import tb.ux9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class StructListAdapter extends RecyclerView.Adapter<MyViewHodler> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<LiveItem.TimeMovingLabelInfos> f13092a;
    public int b = -1;
    public final String c;
    public final n0e d;
    public final ux9 e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class MyViewHodler extends RecyclerView.ViewHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public TUrlImageView f13093a;
        public TextView b;
        public LinearLayout c;
        public ImageView d;

        static {
            t2o.a(779092674);
        }

        public MyViewHodler(StructListAdapter structListAdapter, View view) {
            super(view);
            b0(view);
        }

        public static /* synthetic */ Object ipc$super(MyViewHodler myViewHodler, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/movehighlight/dx/widget/structLayout/StructListAdapter$MyViewHodler");
        }

        public final void b0(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("817b6229", new Object[]{this, view});
                return;
            }
            this.c = (LinearLayout) view.findViewById(R.id.taolive_timeshift_dx_struct_item);
            TUrlImageView tUrlImageView = (TUrlImageView) view.findViewById(R.id.taolive_timeshift_dx_struct_item_image);
            this.f13093a = tUrlImageView;
            tUrlImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.f13093a.setSkipAutoSize(true);
            this.b = (TextView) view.findViewById(R.id.taolive_timeshift_dx_struct_item_text);
            this.d = (ImageView) view.findViewById(R.id.taolive_higlight_decoration_img);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f13094a;

        public a(int i) {
            this.f13094a = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (StructListAdapter.M(StructListAdapter.this) != null) {
                StructListAdapter.M(StructListAdapter.this).b(this.f13094a);
                try {
                    HashMap hashMap = new HashMap();
                    hashMap.put("item_id", StructListAdapter.N(StructListAdapter.this));
                    hashMap.put("feature_clicknumber", String.valueOf(this.f13094a));
                    if (StructListAdapter.O(StructListAdapter.this) != null) {
                        hashMap.put("feature_amount", String.valueOf(StructListAdapter.O(StructListAdapter.this).size()));
                        if (StructListAdapter.O(StructListAdapter.this).size() > this.f13094a) {
                            hashMap.put("feature_label", ((LiveItem.TimeMovingLabelInfos) StructListAdapter.O(StructListAdapter.this).get(this.f13094a)).labelName);
                        }
                    }
                    sbu.f(StructListAdapter.P(StructListAdapter.this), "feature_dianji_new", hashMap);
                } catch (Exception unused) {
                }
            }
        }
    }

    static {
        t2o.a(779092672);
    }

    public StructListAdapter(Context context, List<LiveItem.TimeMovingLabelInfos> list, n0e n0eVar, String str, ux9 ux9Var) {
        this.c = str;
        this.d = n0eVar;
        this.f13092a = list;
        this.e = ux9Var;
    }

    public static /* synthetic */ n0e M(StructListAdapter structListAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n0e) ipChange.ipc$dispatch("abb7b381", new Object[]{structListAdapter});
        }
        return structListAdapter.d;
    }

    public static /* synthetic */ String N(StructListAdapter structListAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22552cf3", new Object[]{structListAdapter});
        }
        return structListAdapter.c;
    }

    public static /* synthetic */ List O(StructListAdapter structListAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("560375b", new Object[]{structListAdapter});
        }
        return structListAdapter.f13092a;
    }

    public static /* synthetic */ ux9 P(StructListAdapter structListAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ux9) ipChange.ipc$dispatch("4bf53353", new Object[]{structListAdapter});
        }
        return structListAdapter.e;
    }

    public static /* synthetic */ Object ipc$super(StructListAdapter structListAdapter, String str, Object... objArr) {
        if (str.hashCode() == 1995301502) {
            super.onViewAttachedToWindow((RecyclerView.ViewHolder) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/movehighlight/dx/widget/structLayout/StructListAdapter");
    }

    /* renamed from: Q */
    public void onBindViewHolder(MyViewHodler myViewHodler, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a162ccf5", new Object[]{this, myViewHodler, new Integer(i)});
            return;
        }
        List<LiveItem.TimeMovingLabelInfos> list = this.f13092a;
        if (list != null && i < list.size()) {
            if (this.f13092a.get(i).hashCode() == this.b) {
                myViewHodler.f13093a.setImageUrl("https://gw.alicdn.com/tfs/TB15HyZa_M11u4jSZPxXXahcXXa-48-48.gif");
                myViewHodler.f13093a.setPadding(4, 4, 4, 4);
                myViewHodler.b.setTypeface(Typeface.defaultFromStyle(1));
                myViewHodler.b.setTextColor(-1);
            } else {
                myViewHodler.f13093a.setImageUrl("https://img.alicdn.com/imgextra/i4/O1CN01AFKT8r1iIfXX8rRGJ_!!6000000004390-2-tps-56-56.png");
                myViewHodler.f13093a.setPadding(0, 0, 0, 0);
                myViewHodler.b.setTypeface(Typeface.defaultFromStyle(0));
                myViewHodler.b.setTextColor(Color.parseColor("#CCFFFFFF"));
            }
            myViewHodler.b.setText(this.f13092a.get(i).labelName);
            if (i == this.f13092a.size() - 1) {
                myViewHodler.d.setVisibility(8);
            } else {
                myViewHodler.d.setVisibility(0);
            }
            myViewHodler.c.setOnClickListener(new a(i));
        }
    }

    /* renamed from: S */
    public MyViewHodler onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MyViewHodler) ipChange.ipc$dispatch("fa46b1ff", new Object[]{this, viewGroup, new Integer(i)});
        }
        return new MyViewHodler(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.taolive_highligt_dx_timeshift_struct_item, (ViewGroup) null));
    }

    /* renamed from: T */
    public void onViewAttachedToWindow(MyViewHodler myViewHodler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4304394", new Object[]{this, myViewHodler});
            return;
        }
        super.onViewAttachedToWindow(myViewHodler);
        try {
            int adapterPosition = myViewHodler.getAdapterPosition();
            HashMap hashMap = new HashMap();
            hashMap.put("item_id", this.c);
            hashMap.put("feature_viewnumber", String.valueOf(1 + adapterPosition));
            List<LiveItem.TimeMovingLabelInfos> list = this.f13092a;
            if (list != null) {
                hashMap.put("feature_amount", String.valueOf(list.size()));
                if (this.f13092a.size() > adapterPosition) {
                    hashMap.put("feature_label", this.f13092a.get(adapterPosition).labelName);
                }
            }
            sbu.k(this.e, "feature_baoguang", hashMap);
        } catch (Exception unused) {
        }
    }

    public void U(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fe64204", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public void V(List<LiveItem.TimeMovingLabelInfos> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b508f553", new Object[]{this, list});
        } else {
            this.f13092a = list;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        return this.f13092a.size();
    }
}
