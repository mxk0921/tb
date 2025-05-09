package com.taobao.tao.sharepanel.weex.bridge;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.ui.engine.structure.BubbleTipsBean;
import tb.gjp;
import tb.lr7;
import tb.mip;
import tb.oj8;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class BubbleBridge {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RecyclerView f12766a;
        public final /* synthetic */ int b;
        public final /* synthetic */ String c;

        public a(RecyclerView recyclerView, int i, String str) {
            this.f12766a = recyclerView;
            this.b = i;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                BubbleBridge.b(this.f12766a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                oj8.d().c(oj8.HIDE_BUBBLE_EVENT, oj8.EMPTY_EVENT);
            }
        }
    }

    static {
        t2o.a(666894576);
    }

    public static void a(final RecyclerView recyclerView, BubbleTipsBean bubbleTipsBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d725268", new Object[]{recyclerView, bubbleTipsBean});
        } else if (bubbleTipsBean != null && mip.q() && recyclerView != null) {
            String index = bubbleTipsBean.getIndex();
            final String text = bubbleTipsBean.getText();
            try {
                final int parseInt = Integer.parseInt(index);
                if (!TextUtils.isEmpty(text) && parseInt >= 0) {
                    recyclerView.post(new a(recyclerView, parseInt, text));
                    recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.tao.sharepanel.weex.bridge.BubbleBridge.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        public static /* synthetic */ Object ipc$super(AnonymousClass2 r5, String str, Object... objArr) {
                            int hashCode = str.hashCode();
                            if (hashCode == -1177043419) {
                                super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                                return null;
                            } else if (hashCode == 1361287682) {
                                super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                                return null;
                            } else {
                                int hashCode2 = str.hashCode();
                                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/sharepanel/weex/bridge/BubbleBridge$2");
                            }
                        }

                        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                        public void onScrollStateChanged(RecyclerView recyclerView2, int i) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("51239a02", new Object[]{this, recyclerView2, new Integer(i)});
                                return;
                            }
                            super.onScrollStateChanged(recyclerView2, i);
                            if (i == 0) {
                                RecyclerView.LayoutManager layoutManager = RecyclerView.this.getLayoutManager();
                                if (layoutManager instanceof LinearLayoutManager) {
                                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                                    int findFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
                                    int findLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
                                    int i2 = parseInt;
                                    if (i2 >= findFirstCompletelyVisibleItemPosition && i2 <= findLastCompletelyVisibleItemPosition) {
                                        BubbleBridge.b(RecyclerView.this, i2 - findFirstCompletelyVisibleItemPosition, text);
                                    }
                                }
                            }
                        }

                        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                        public void onScrolled(RecyclerView recyclerView2, int i, int i2) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView2, new Integer(i), new Integer(i2)});
                                return;
                            }
                            super.onScrolled(recyclerView2, i, i2);
                            if (i > 0) {
                                oj8.d().c(oj8.HIDE_BUBBLE_EVENT, oj8.EMPTY_EVENT);
                            }
                        }
                    });
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void b(RecyclerView recyclerView, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e35d7f8", new Object[]{recyclerView, new Integer(i), str});
        } else if (i >= 0 && i < recyclerView.getChildCount()) {
            View childAt = recyclerView.getChildAt(i);
            int left = (childAt.getLeft() + (childAt.getWidth() / 2)) - lr7.b(gjp.a().getApplicationContext(), 26.0f);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("text", (Object) str);
            jSONObject.put("left", (Object) Integer.valueOf(left));
            oj8.d().c(oj8.SHOW_BUBBLE_EVENT, jSONObject);
            recyclerView.postDelayed(new b(), 5000L);
        }
    }
}
