package com.taobao.taolive.uikit.view;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.taolive.uikit.utils.RecyclerViewScrollHelper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import tb.cpb;
import tb.t2o;
import tb.to8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBLCommentView extends FrameLayout implements cpb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static List<Integer> COLOR_RANGE = new ArrayList();
    private static Random mRandom = new Random();
    private CommentAdapter mAdapter;
    private RecyclerView mRecyclerView;
    public RecyclerViewScrollHelper.TopSmoothScroller mScroller;
    private b mTimer;
    private int mScrollInterval = 0;
    private int mCurrent = 0;
    private c mTimerHandlerListener = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class CommentViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f13350a;
        public final TextView b;

        static {
            t2o.a(806356551);
        }

        public CommentViewHolder(View view, int i) {
            super(view);
            TextView textView = (TextView) view.findViewById(R.id.tbliveuikit_comment_nick);
            this.f13350a = textView;
            TextView textView2 = (TextView) view.findViewById(R.id.tbliveuikit_comment_content);
            this.b = textView2;
            TextView textView3 = (TextView) view.findViewById(R.id.tbliveuikit_comment_colon);
            if (textView2 != null) {
                textView2.setTextSize(i);
            }
            int color = view.getContext().getResources().getColor(((Integer) TBLCommentView.access$400().get(TBLCommentView.access$500().nextInt(TBLCommentView.access$400().size()))).intValue());
            if (textView3 != null) {
                textView3.setTextSize(i);
                textView3.setTextColor(color);
            }
            if (textView != null) {
                textView.setTextSize(i);
                textView.setTextColor(color);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.taolive.uikit.view.TBLCommentView.c
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("82685e6c", new Object[]{this});
                return;
            }
            TBLCommentView.access$104(TBLCommentView.this);
            if (TBLCommentView.access$200(TBLCommentView.this) != null && TBLCommentView.access$300(TBLCommentView.this) != null) {
                TBLCommentView tBLCommentView = TBLCommentView.this;
                if (tBLCommentView.mScroller != null) {
                    if (TBLCommentView.access$100(tBLCommentView) >= TBLCommentView.access$200(TBLCommentView.this).getItemCount() - 1) {
                        TBLCommentView.access$102(TBLCommentView.this, 0);
                    }
                    if (TBLCommentView.access$100(TBLCommentView.this) == 0) {
                        TBLCommentView.access$300(TBLCommentView.this).scrollToPosition(TBLCommentView.access$100(TBLCommentView.this));
                    } else {
                        RecyclerViewScrollHelper.a(TBLCommentView.access$300(TBLCommentView.this), TBLCommentView.access$100(TBLCommentView.this), TBLCommentView.this.mScroller);
                    }
                }
            }
        }

        @Override // com.taobao.taolive.uikit.view.TBLCommentView.c
        public int b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("68e91c96", new Object[]{this})).intValue();
            }
            return 0;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final long f13352a;
        public boolean b = true;
        public WeakReference<c> c;

        static {
            t2o.a(806356552);
        }

        public b(c cVar, long j, Looper looper) {
            super(looper);
            this.c = new WeakReference<>(cVar);
            this.f13352a = j;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/uikit/view/TBLCommentView$TimerHandler");
        }

        public final long a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4acb9cc2", new Object[]{this, new Integer(i)})).longValue();
            }
            return this.f13352a;
        }

        public boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d2d2044e", new Object[]{this})).booleanValue();
            }
            return this.b;
        }

        public void c(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f1a5ba16", new Object[]{this, cVar});
            } else {
                this.c = new WeakReference<>(cVar);
            }
        }

        public void d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4c0bd302", new Object[]{this, new Boolean(z)});
            } else {
                this.b = z;
            }
        }

        public void e(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f898a7df", new Object[]{this, new Integer(i)});
            } else {
                sendEmptyMessageDelayed(87208, a(i));
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            WeakReference<c> weakReference;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (87208 == message.what && (weakReference = this.c) != null && weakReference.get() != null) {
                int b = this.c.get().b();
                try {
                    this.c.get().a();
                } catch (Exception e) {
                    TLog.loge("live_uikit.TimerHandler", "handlerMessage exp.", e);
                }
                e(b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface c {
        void a();

        int b();
    }

    static {
        t2o.a(806356548);
        t2o.a(806356529);
        COLOR_RANGE.add(Integer.valueOf(R.color.tbliveuikit_chat_color1));
        COLOR_RANGE.add(Integer.valueOf(R.color.tbliveuikit_chat_color2));
        COLOR_RANGE.add(Integer.valueOf(R.color.tbliveuikit_chat_color3));
        COLOR_RANGE.add(Integer.valueOf(R.color.tbliveuikit_chat_color4));
    }

    public TBLCommentView(Context context) {
        super(context);
        init();
    }

    public static /* synthetic */ int access$100(TBLCommentView tBLCommentView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("74d841cb", new Object[]{tBLCommentView})).intValue();
        }
        return tBLCommentView.mCurrent;
    }

    public static /* synthetic */ int access$102(TBLCommentView tBLCommentView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("81e1a0dc", new Object[]{tBLCommentView, new Integer(i)})).intValue();
        }
        tBLCommentView.mCurrent = i;
        return i;
    }

    public static /* synthetic */ int access$104(TBLCommentView tBLCommentView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8304b8cf", new Object[]{tBLCommentView})).intValue();
        }
        int i = tBLCommentView.mCurrent + 1;
        tBLCommentView.mCurrent = i;
        return i;
    }

    public static /* synthetic */ CommentAdapter access$200(TBLCommentView tBLCommentView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CommentAdapter) ipChange.ipc$dispatch("558a8145", new Object[]{tBLCommentView});
        }
        return tBLCommentView.mAdapter;
    }

    public static /* synthetic */ RecyclerView access$300(TBLCommentView tBLCommentView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("80a3d681", new Object[]{tBLCommentView});
        }
        return tBLCommentView.mRecyclerView;
    }

    public static /* synthetic */ List access$400() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6ee5f86c", new Object[0]);
        }
        return COLOR_RANGE;
    }

    public static /* synthetic */ Random access$500() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Random) ipChange.ipc$dispatch("78bcd006", new Object[0]);
        }
        return mRandom;
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mRecyclerView = new RecyclerView(getContext());
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        CommentAdapter commentAdapter = new CommentAdapter(null);
        this.mAdapter = commentAdapter;
        this.mRecyclerView.setAdapter(commentAdapter);
        addView(this.mRecyclerView, new FrameLayout.LayoutParams(-1, -1));
        this.mScroller = new RecyclerViewScrollHelper.TopSmoothScroller(getContext());
    }

    private void initTimer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fb3ce1c", new Object[]{this});
        } else if (this.mScrollInterval != 0) {
            if (this.mTimer != null) {
                stopTimer();
            }
            this.mTimer = new b(this.mTimerHandlerListener, this.mScrollInterval, Looper.getMainLooper());
            startTimer();
        }
    }

    public static /* synthetic */ Object ipc$super(TBLCommentView tBLCommentView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1705336120:
                super.setVisibility(((Number) objArr[0]).intValue());
                return null;
            case -270519527:
                super.onFinishTemporaryDetach();
                return null;
            case 348684699:
                super.onVisibilityChanged((View) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            case 1861606664:
                super.onStartTemporaryDetach();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/uikit/view/TBLCommentView");
        }
    }

    private void startTimer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edfb8b0a", new Object[]{this});
            return;
        }
        b bVar = this.mTimer;
        if (bVar != null && bVar.b()) {
            this.mCurrent = 0;
            this.mTimer.c(this.mTimerHandlerListener);
            this.mTimer.removeCallbacksAndMessages(null);
            this.mTimer.e(0);
            this.mTimer.d(false);
        }
    }

    private void stopTimer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b325b6a", new Object[]{this});
            return;
        }
        b bVar = this.mTimer;
        if (bVar != null && !bVar.b()) {
            this.mCurrent = 0;
            this.mTimer.removeCallbacksAndMessages(null);
            this.mTimer.c(null);
            this.mTimer.d(true);
        }
    }

    @Override // tb.cpb
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            stopTimer();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        startTimer();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        stopTimer();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efe03319", new Object[]{this});
            return;
        }
        super.onFinishTemporaryDetach();
        startTimer();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        return true;
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ef5dd08", new Object[]{this});
            return;
        }
        super.onStartTemporaryDetach();
        stopTimer();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c8819b", new Object[]{this, view, new Integer(i)});
            return;
        }
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            startTimer();
        } else {
            stopTimer();
        }
    }

    @Override // tb.cpb
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        } else {
            stopTimer();
        }
    }

    @Override // tb.cpb
    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
        } else {
            startTimer();
        }
    }

    public void setDataList(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("737e2299", new Object[]{this, jSONArray});
            return;
        }
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.scrollToPosition(0);
        }
        CommentAdapter commentAdapter = this.mAdapter;
        if (commentAdapter != null) {
            commentAdapter.O(jSONArray);
        }
    }

    public void setScrollInterval(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d322e828", new Object[]{this, new Integer(i)});
            return;
        }
        this.mScrollInterval = i;
        initTimer();
    }

    public void setTextHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1b4e66", new Object[]{this, new Integer(i)});
            return;
        }
        CommentAdapter commentAdapter = this.mAdapter;
        if (commentAdapter != null) {
            commentAdapter.P(i);
        }
    }

    public void setTextSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b5ef80c", new Object[]{this, new Integer(i)});
            return;
        }
        CommentAdapter commentAdapter = this.mAdapter;
        if (commentAdapter != null) {
            commentAdapter.Q(i);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5aa2c8", new Object[]{this, new Integer(i)});
        } else {
            super.setVisibility(i);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class CommentAdapter extends RecyclerView.Adapter<CommentViewHolder> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final JSONArray f13349a;
        public int b;

        static {
            t2o.a(806356550);
        }

        private CommentAdapter() {
            this.f13349a = new JSONArray();
        }

        public static /* synthetic */ Object ipc$super(CommentAdapter commentAdapter, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/uikit/view/TBLCommentView$CommentAdapter");
        }

        /* renamed from: M */
        public void onBindViewHolder(CommentViewHolder commentViewHolder, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c4a66e7b", new Object[]{this, commentViewHolder, new Integer(i)});
            } else if (i >= 0 && i < this.f13349a.size()) {
                JSONObject jSONObject = this.f13349a.getJSONObject(i);
                if (commentViewHolder != null && jSONObject != null) {
                    TextView textView = commentViewHolder.f13350a;
                    if (textView != null) {
                        textView.setText(jSONObject.getString("nick"));
                    }
                    TextView textView2 = commentViewHolder.b;
                    if (textView2 != null) {
                        textView2.setText(jSONObject.getString(to8.COMMENT));
                    }
                }
            }
        }

        /* renamed from: N */
        public CommentViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CommentViewHolder) ipChange.ipc$dispatch("4504839", new Object[]{this, viewGroup, new Integer(i)});
            }
            return new CommentViewHolder((ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tbliveuikit_comment_item, viewGroup, false), this.b);
        }

        public void O(JSONArray jSONArray) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4457adb", new Object[]{this, jSONArray});
                return;
            }
            this.f13349a.clear();
            if (jSONArray != null) {
                this.f13349a.addAll(jSONArray);
            }
            notifyDataSetChanged();
        }

        public void P(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c1b4e66", new Object[]{this, new Integer(i)});
            }
        }

        public void Q(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7b5ef80c", new Object[]{this, new Integer(i)});
            } else {
                this.b = i;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
            }
            return this.f13349a.size();
        }

        public /* synthetic */ CommentAdapter(a aVar) {
            this();
        }
    }

    public TBLCommentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public TBLCommentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
