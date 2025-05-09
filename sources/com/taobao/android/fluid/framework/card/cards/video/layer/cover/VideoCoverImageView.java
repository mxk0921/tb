package com.taobao.android.fluid.framework.card.cards.video.layer.cover;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.adapter.IImageAdapter;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.uikit.feature.view.TImageView;
import tb.ir9;
import tb.nd2;
import tb.p1m;
import tb.s0m;
import tb.s8d;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class VideoCoverImageView extends TImageView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "VideoCoverImageView";
    private c mMainFrontHandler = new c();
    private s8d mSuccListener;
    private p1m mTicket;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (succPhenixEvent.getDrawable() != null && !succPhenixEvent.isIntermediate()) {
                VideoCoverImageView.this.setImageDrawable(succPhenixEvent.getDrawable());
                if (VideoCoverImageView.access$000(VideoCoverImageView.this) != null) {
                    VideoCoverImageView.access$000(VideoCoverImageView.this).onHappen(succPhenixEvent);
                }
                ir9.b(VideoCoverImageView.TAG, "封面下载命中：" + VideoCoverImageView.access$100(succPhenixEvent));
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(VideoCoverImageView videoCoverImageView) {
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            ir9.b(VideoCoverImageView.TAG, "封面下载失败：" + failPhenixEvent.getResultCode());
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(468714005);
        }

        public c() {
            super(Looper.getMainLooper());
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            if (str.hashCode() == 40891567) {
                return new Boolean(super.sendMessageAtTime((Message) objArr[0], ((Number) objArr[1]).longValue()));
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/card/cards/video/layer/cover/VideoCoverImageView$MainFrontHandler");
        }

        @Override // android.os.Handler
        public boolean sendMessageAtTime(Message message, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("26ff4af", new Object[]{this, message, new Long(j)})).booleanValue();
            }
            return super.sendMessageAtTime(message, 0L);
        }
    }

    static {
        t2o.a(468714002);
    }

    public VideoCoverImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public static /* synthetic */ s8d access$000(VideoCoverImageView videoCoverImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s8d) ipChange.ipc$dispatch("cf5d8667", new Object[]{videoCoverImageView});
        }
        return videoCoverImageView.mSuccListener;
    }

    public static /* synthetic */ String access$100(SuccPhenixEvent succPhenixEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c1e0ee0", new Object[]{succPhenixEvent});
        }
        return getCacheType(succPhenixEvent);
    }

    private static String getCacheType(SuccPhenixEvent succPhenixEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c22d24b", new Object[]{succPhenixEvent});
        }
        if (succPhenixEvent.isImmediate()) {
            return "mem";
        }
        if (succPhenixEvent.isFromDisk()) {
            return "disk";
        }
        return "net";
    }

    public static /* synthetic */ Object ipc$super(VideoCoverImageView videoCoverImageView, String str, Object... objArr) {
        if (str.hashCode() == -1150258430) {
            super.setImageDrawable((Drawable) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/card/cards/video/layer/cover/VideoCoverImageView");
    }

    public void setCoverImageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afef3b7a", new Object[]{this, str});
            return;
        }
        p1m p1mVar = this.mTicket;
        if (p1mVar != null && p1mVar.f(str)) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            s0m.B().f(this.mTicket);
            return;
        }
        p1m p1mVar2 = this.mTicket;
        if (p1mVar2 != null && p1mVar2.f(str)) {
            this.mTicket.a();
        }
        PhenixCreator U = s0m.B().N0(getContext()).U(null, str);
        U.addLoaderExtra(nd2.BUNDLE_BIZ_CODE, IImageAdapter.IMAGE_ORIGIN_MODE_NORMAL_BIZID);
        U.schedulePriority(4);
        U.handler(this.mMainFrontHandler);
        U.succListener(new a());
        U.failListener(new b(this));
        p1m fetch = U.fetch();
        this.mTicket = fetch;
        fetch.e(str);
    }

    @Override // com.taobao.uikit.feature.view.TImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        p1m p1mVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb707302", new Object[]{this, drawable});
            return;
        }
        if (drawable == null && (p1mVar = this.mTicket) != null) {
            p1mVar.a();
            this.mTicket = null;
        }
        super.setImageDrawable(drawable);
    }

    public void succListener(s8d<SuccPhenixEvent> s8dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99911ee0", new Object[]{this, s8dVar});
        } else {
            this.mSuccListener = s8dVar;
        }
    }

    public VideoCoverImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VideoCoverImageView(Context context) {
        super(context);
    }
}
