package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.recycler.loadmore.DXAbsOnLoadMoreView;
import com.taobao.android.dinamicx.widget.refresh.layout.DXRefreshLayout;
import com.taobao.android.dinamicx.widget.refresh.layout.constant.DXRefreshState;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class a36 extends rb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOADMORE_TITLE = "load_more_title";
    public final View e;
    public final TextView f;
    public final ProgressBar g;
    public final DXAbsOnLoadMoreView h;
    public final ViewGroup i;

    static {
        t2o.a(444597620);
    }

    public a36(Context context) {
        this(context, null);
    }

    public static /* synthetic */ Object ipc$super(a36 a36Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/refresh/header/DXLoadMoreHeader");
    }

    @Override // tb.avk
    public void d(DXRefreshLayout dXRefreshLayout, DXRefreshState dXRefreshState, DXRefreshState dXRefreshState2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8269120", new Object[]{this, dXRefreshLayout, dXRefreshState, dXRefreshState2});
        } else if (dXRefreshState != dXRefreshState2) {
            x(dXRefreshLayout, w(dXRefreshState2));
            avk avkVar = this.f27244a;
            if (avkVar != null) {
                avkVar.d(dXRefreshLayout, dXRefreshState, dXRefreshState2);
            }
        }
    }

    @Override // tb.ba6
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.i;
    }

    public final int w(DXRefreshState dXRefreshState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("79a347d3", new Object[]{this, dXRefreshState})).intValue();
        }
        if (dXRefreshState == DXRefreshState.None) {
            return 4;
        }
        if (dXRefreshState == DXRefreshState.PullDownLoading) {
            return 2;
        }
        if (dXRefreshState == DXRefreshState.PullDownLoadFail) {
            return 3;
        }
        if (dXRefreshState == DXRefreshState.PullDownLoadNoData) {
            return 5;
        }
        return 4;
    }

    public void x(DXRefreshLayout dXRefreshLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce13797c", new Object[]{this, dXRefreshLayout, new Integer(i)});
            return;
        }
        TextView textView = this.f;
        if (textView != null) {
            int i2 = this.c;
            if (i2 != 0) {
                textView.setTextColor(i2);
            }
            int i3 = this.d;
            if (i3 != 0) {
                this.f.setTextSize(0, i3);
            }
        }
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        if (i == 6) {
                            if (this.h != null) {
                                this.h.onLoadMoreStatusUpdate(i, new JSONObject());
                            } else {
                                this.g.setVisibility(8);
                                this.f.setText("");
                            }
                        }
                    } else if (this.h != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("load_more_title", (Object) m());
                        this.h.onLoadMoreStatusUpdate(i, jSONObject);
                    } else {
                        this.g.setVisibility(8);
                        this.f.setVisibility(0);
                        this.f.setText(m());
                    }
                } else if (this.h != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("load_more_title", (Object) "");
                    this.h.onLoadMoreStatusUpdate(i, jSONObject2);
                } else {
                    this.g.setVisibility(8);
                    this.f.setVisibility(0);
                    this.f.setText("");
                }
            } else if (this.h != null) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("load_more_title", (Object) k());
                this.h.onLoadMoreStatusUpdate(i, jSONObject3);
            } else {
                this.g.setVisibility(8);
                this.f.setVisibility(0);
                this.f.setText(k());
            }
        } else if (this.h != null) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("load_more_title", (Object) l());
            this.h.onLoadMoreStatusUpdate(i, jSONObject4);
        } else {
            this.g.setVisibility(0);
            this.f.setVisibility(0);
            this.f.setText(l());
        }
        if (this.i == null) {
            return;
        }
        if (i == 6 || i == 4 || (i == 5 && TextUtils.isEmpty(m()))) {
            this.i.setVisibility(8);
            dXRefreshLayout.closeHeaderOrFooter();
            return;
        }
        this.i.setVisibility(0);
    }

    public a36(Context context, DXAbsOnLoadMoreView dXAbsOnLoadMoreView) {
        this.h = dXAbsOnLoadMoreView;
        if (dXAbsOnLoadMoreView == null) {
            View a2 = xb6.a(context, R.layout.dx_scrollable_load_more_bottom);
            this.e = a2;
            this.f = (TextView) a2.findViewById(R.id.scrollable_loadmore_tv);
            this.g = (ProgressBar) a2.findViewById(R.id.scrollable_loadmore_progressbar);
        }
        r("加载中");
        s("");
        q("太火爆啦，点我再尝试下吧");
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.i = relativeLayout;
        if (dXAbsOnLoadMoreView != null) {
            relativeLayout.addView(dXAbsOnLoadMoreView, new ViewGroup.LayoutParams(-1, -2));
            return;
        }
        View view = this.e;
        if (view != null) {
            relativeLayout.addView(view, new ViewGroup.LayoutParams(-1, -2));
        }
    }
}
