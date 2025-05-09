package tb;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.HImageView;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseItemModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class rkj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f27443a;
    public final FrameLayout[] b;
    public final ProgressBar c;
    public final r44 d = new r44();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View.OnClickListener f27444a;
        public final /* synthetic */ FrameLayout[] b;

        public a(View.OnClickListener onClickListener, FrameLayout[] frameLayoutArr) {
            this.f27444a = onClickListener;
            this.b = frameLayoutArr;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            View.OnClickListener onClickListener = this.f27444a;
            if (onClickListener != null) {
                onClickListener.onClick(view);
                for (FrameLayout frameLayout : this.b) {
                    frameLayout.setVisibility(8);
                }
                rkj.a(rkj.this).setVisibility(8);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BaseSectionModel f27445a;
        public final /* synthetic */ int b;
        public final /* synthetic */ View.OnClickListener c;
        public final /* synthetic */ JSONObject d;
        public final /* synthetic */ BaseSectionModel e;

        public b(BaseSectionModel baseSectionModel, int i, View.OnClickListener onClickListener, JSONObject jSONObject, BaseSectionModel baseSectionModel2) {
            this.f27445a = baseSectionModel;
            this.b = i;
            this.c = onClickListener;
            this.d = jSONObject;
            this.e = baseSectionModel2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                rkj.b(rkj.this, this.f27445a, this.b, this.c, this.d, this.e);
            }
        }
    }

    static {
        t2o.a(491782503);
    }

    public rkj(LinearLayout linearLayout, FrameLayout[] frameLayoutArr, ProgressBar progressBar) {
        this.f27443a = linearLayout;
        this.b = frameLayoutArr;
        this.c = progressBar;
    }

    public static /* synthetic */ LinearLayout a(rkj rkjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("dd679af8", new Object[]{rkjVar});
        }
        return rkjVar.f27443a;
    }

    public static /* synthetic */ void b(rkj rkjVar, BaseSectionModel baseSectionModel, int i, View.OnClickListener onClickListener, JSONObject jSONObject, BaseSectionModel baseSectionModel2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3181b5a", new Object[]{rkjVar, baseSectionModel, new Integer(i), onClickListener, jSONObject, baseSectionModel2});
        } else {
            rkjVar.e(baseSectionModel, i, onClickListener, jSONObject, baseSectionModel2);
        }
    }

    public void c(BaseSectionModel<?> baseSectionModel, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, BaseSectionModel<?> baseSectionModel2) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e1af7fe", new Object[]{this, baseSectionModel, onClickListener, onClickListener2, baseSectionModel2});
            return;
        }
        BaseItemModel item = baseSectionModel.getItem();
        if (item != null) {
            g(onClickListener2, item, this.b);
            ArrayList arrayList = new ArrayList();
            while (true) {
                if (item.getJSONObject("" + i) == null) {
                    break;
                }
                arrayList.add(d(item, "" + i));
                i++;
            }
            if (arrayList.isEmpty()) {
                this.f27443a.setVisibility(8);
                return;
            }
            f(arrayList, this.b, baseSectionModel, onClickListener, baseSectionModel2);
            this.d.b(baseSectionModel);
        }
    }

    public final JSONObject d(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e796ba56", new Object[]{this, jSONObject, str});
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getJSONObject(str);
    }

    public final void e(BaseSectionModel<?> baseSectionModel, int i, View.OnClickListener onClickListener, JSONObject jSONObject, BaseSectionModel<?> baseSectionModel2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52effe7", new Object[]{this, baseSectionModel, new Integer(i), onClickListener, jSONObject, baseSectionModel2});
            return;
        }
        this.d.a(baseSectionModel, jSONObject);
        LinearLayout linearLayout = this.f27443a;
        FrameLayout[] frameLayoutArr = this.b;
        View[] viewArr = {linearLayout, frameLayoutArr[0], frameLayoutArr[1], frameLayoutArr[2]};
        for (int i2 = 0; i2 < 4; i2++) {
            View view = viewArr[i2];
            view.setClickable(false);
            view.setVisibility(8);
        }
        onClickListener.onClick(viewArr[i]);
        hue.d(null, baseSectionModel2, jSONObject);
        this.c.setVisibility(0);
    }

    public final void h(FrameLayout frameLayout, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("791d1403", new Object[]{this, frameLayout, str, str2});
            return;
        }
        frameLayout.setVisibility(0);
        if (frameLayout.getChildAt(0) instanceof LinearLayout) {
            LinearLayout linearLayout = (LinearLayout) frameLayout.getChildAt(0);
            if (linearLayout.getChildAt(1) instanceof TextView) {
                ((TextView) linearLayout.getChildAt(1)).setText(str);
            }
            if (linearLayout.getChildAt(0) instanceof HImageView) {
                ((HImageView) linearLayout.getChildAt(0)).setImageUrl(str2);
            }
        }
    }

    public final void g(View.OnClickListener onClickListener, JSONObject jSONObject, FrameLayout[] frameLayoutArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf025353", new Object[]{this, onClickListener, jSONObject, frameLayoutArr});
        } else if (jSONObject.getJSONObject(r4p.VALUE_SHOWTYPE_SIMILAR) == null) {
            this.f27443a.setVisibility(8);
        } else {
            this.f27443a.setVisibility(0);
            this.f27443a.setOnClickListener(new a(onClickListener, frameLayoutArr));
        }
    }

    public final void f(List<JSONObject> list, FrameLayout[] frameLayoutArr, BaseSectionModel<?> baseSectionModel, View.OnClickListener onClickListener, BaseSectionModel<?> baseSectionModel2) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcf2e665", new Object[]{this, list, frameLayoutArr, baseSectionModel, onClickListener, baseSectionModel2});
            return;
        }
        int size = list.size();
        while (i < frameLayoutArr.length) {
            JSONObject jSONObject = i < size ? list.get(i) : null;
            JSONObject d = d(jSONObject, "content");
            if (jSONObject != null && d != null) {
                String string = d.getString("title");
                String string2 = d.getString("pic");
                FrameLayout frameLayout = frameLayoutArr[i];
                h(frameLayout, string, string2);
                frameLayout.setTag(d.getString("reasonArgs"));
                int i2 = i + 1;
                frameLayout.setOnClickListener(new b(baseSectionModel, i2, onClickListener, jSONObject, baseSectionModel2));
                i = i2;
            } else {
                return;
            }
        }
    }
}
