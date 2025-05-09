package com.taobao.android.detail.ttdetail.widget.video;

import android.content.Context;
import android.content.Intent;
import android.graphics.Outline;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import tb.ksk;
import tb.mr7;
import tb.nj7;
import tb.rql;
import tb.t2o;
import tb.tq4;
import tb.vbl;
import tb.w6f;
import tb.ze7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class AbsMiniVideoView<T extends rql> extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Context mContext;
    public ze7 mDetailContext;
    public ksk mOnMiniVideoListener;
    public JSONObject mTrackParams;
    private final float RADIUS = TypedValue.applyDimension(1, 4.0f, getResources().getDisplayMetrics());
    public float mWindowWithRatio = -1.0f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/video/AbsMiniVideoView$1");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
            } else {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), AbsMiniVideoView.access$000(AbsMiniVideoView.this));
            }
        }
    }

    static {
        t2o.a(912263096);
    }

    public AbsMiniVideoView(Context context) {
        super(context);
        this.mContext = context;
        initView();
    }

    public static /* synthetic */ float access$000(AbsMiniVideoView absMiniVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("47602fb3", new Object[]{absMiniVideoView})).floatValue();
        }
        return absMiniVideoView.RADIUS;
    }

    private void initView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        setClipToOutline(true);
        setOutlineProvider(new a());
    }

    public static /* synthetic */ Object ipc$super(AbsMiniVideoView absMiniVideoView, String str, Object... objArr) {
        if (str.hashCode() == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/video/AbsMiniVideoView");
    }

    public void attachVideoLastFrame(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba09c3b2", new Object[]{this, str});
        }
    }

    public void bindDetailContext(ze7 ze7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("170e978c", new Object[]{this, ze7Var});
        } else {
            this.mDetailContext = ze7Var;
        }
    }

    public void closeGlobalLiveVideoView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1f26a40", new Object[]{this});
        } else if (vbl.p()) {
            Intent intent = new Intent();
            intent.setAction(w6f.TAOLIVE_SHOW_MINILIVE_ACTION);
            intent.putExtra("actionType", "hideAllMiniLive");
            LocalBroadcastManager.getInstance(this.mContext).sendBroadcast(intent);
        }
    }

    public abstract void detachVideoView();

    public Rect getContentScreenRect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("f682b1e3", new Object[]{this});
        }
        return null;
    }

    public JSONObject getTrackParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f9fb2ba2", new Object[]{this});
        }
        return this.mTrackParams;
    }

    public Map<String, String> getVideoInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("dece48cf", new Object[]{this});
        }
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        if (nj7.h() || this.mWindowWithRatio == -1.0f) {
            i3 = mr7.b(tq4.d(this), 90.0f);
        } else {
            i3 = (int) Math.ceil((View.MeasureSpec.getSize(i) + mr7.b(tq4.d(this), 18.0f)) / this.mWindowWithRatio);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), i2);
    }

    public abstract boolean pause();

    public abstract boolean play(String str, String str2);

    public abstract boolean playWithUniqueIdentifier(String str);

    public void setOnMiniVideoListener(ksk kskVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53746b16", new Object[]{this, kskVar});
        } else {
            this.mOnMiniVideoListener = kskVar;
        }
    }

    public abstract void setVideoData(List<T> list);

    public void setWindowRatio(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b862fb80", new Object[]{this, new Float(f)});
        } else {
            this.mWindowWithRatio = f;
        }
    }

    public AbsMiniVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mContext = context;
        initView();
    }

    public AbsMiniVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mContext = context;
        initView();
    }
}
