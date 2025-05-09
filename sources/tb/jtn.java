package tb;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.miniLive.services.mtop.RedPacketRainResponse;
import com.taobao.tao.timestamp.TimeStampManager;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.VideoStatus;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.security.SecureRandom;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class jtn {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean q = false;

    /* renamed from: a  reason: collision with root package name */
    public final Handler.Callback f22204a;
    public final View c;
    public final TextView d;
    public final TextView e;
    public long f;
    public long g;
    public long h;
    public int i;
    public boolean j;
    public boolean k;
    public RedPacketRainResponse.RedPacketInfo l;
    public JSONObject m;
    public VideoInfo n;
    public d o;
    public final Handler b = new Handler(new a());
    public final SimpleDateFormat p = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Handler.Callback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
            }
            if (!jtn.a(jtn.this)) {
                o3s.a("MiniRainControl", "小窗已关闭，消息不执行：" + message.what);
                return false;
            }
            o3s.a("MiniRainControl", "执行消息：" + message.what);
            switch (message.what) {
                case 1000:
                    jtn.c(jtn.this);
                    break;
                case 1001:
                    jtn.d(jtn.this);
                    break;
                case 1002:
                    jtn.e(jtn.this);
                    break;
                case 1003:
                    jtn.f(jtn.this);
                    break;
                case 1004:
                    jtn.b(jtn.this);
                    break;
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            o3s.a("MiniRainControl", "请求Error" + i);
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                return;
            }
            o3s.a("MiniRainControl", "请求成功");
            if (!(netBaseOutDo instanceof RedPacketRainResponse)) {
                o3s.a("MiniRainControl", "类型不对，错误");
                return;
            }
            RedPacketRainResponse redPacketRainResponse = (RedPacketRainResponse) netBaseOutDo;
            if (redPacketRainResponse.getData() != null) {
                RedPacketRainResponse.RedPacketInfoWrapper redPacketInfoWrapper = (RedPacketRainResponse.RedPacketInfoWrapper) redPacketRainResponse.getData();
                if (redPacketInfoWrapper != null) {
                    jtn.h(jtn.this, redPacketInfoWrapper.data);
                    if (jtn.g(jtn.this) != null) {
                        jtn.i(jtn.this);
                    }
                }
                if (netResponse != null && netResponse.getDataJsonObject() != null) {
                    jtn.j(jtn.this, netResponse.getDataJsonObject());
                }
            }
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            o3s.a("MiniRainControl", "请求SysError" + i);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ VideoInfo f22207a;
        public final /* synthetic */ RedPacketRainResponse.RedPacketInfo b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements b0d {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a(c cVar) {
            }

            @Override // tb.b0d
            public void onError(int i, NetResponse netResponse, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                    return;
                }
                o3s.a("MiniRainControl", "trackClick请求失败" + i);
            }

            @Override // tb.b0d
            public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                } else {
                    o3s.a("MiniRainControl", "trackClick请求成功");
                }
            }

            @Override // tb.b0d
            public void onSystemError(int i, NetResponse netResponse, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                    return;
                }
                o3s.a("MiniRainControl", "trackClick请求失败，系统错误" + i);
            }
        }

        public c(VideoInfo videoInfo, RedPacketRainResponse.RedPacketInfo redPacketInfo) {
            this.f22207a = videoInfo;
            this.b = redPacketInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            String str2;
            AccountInfo accountInfo;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            VideoInfo videoInfo = this.f22207a;
            String str3 = "";
            if (videoInfo == null || (accountInfo = videoInfo.broadCaster) == null) {
                str = str3;
            } else {
                str = accountInfo.accountId;
            }
            if (videoInfo == null) {
                str2 = str3;
            } else {
                str2 = videoInfo.liveId;
            }
            RedPacketRainResponse.RedPacketInfo redPacketInfo = this.b;
            if (redPacketInfo != null) {
                str3 = redPacketInfo.ename;
            }
            new gtn(new a(this)).L(str, str2, str3);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface d {
        void a(RedPacketRainResponse.RedPacketInfo redPacketInfo, JSONObject jSONObject);

        void onShow();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class e {
        public static final SecureRandom randomNumberGenerator = new SecureRandom();

        static {
            t2o.a(779092010);
        }
    }

    static {
        t2o.a(779092004);
    }

    public jtn(View view) {
        this.c = view.findViewById(R.id.taolive_mini_living_red_packet_rain_overlay);
        this.d = (TextView) view.findViewById(R.id.taolive_mini_living_red_packet_rain_value);
        this.e = (TextView) view.findViewById(R.id.taolive_mini_living_red_packet_rain_subtitle);
        ((TUrlImageView) view.findViewById(R.id.taolive_mini_living_red_packet_rain_icon)).setImageUrl(pvs.w2());
        TUrlImageView tUrlImageView = (TUrlImageView) view.findViewById(R.id.taolive_mini_living_red_packet_rain_bg);
        tUrlImageView.setSkipAutoSize(true);
        tUrlImageView.setImageUrl(pvs.v2());
    }

    public static /* synthetic */ boolean a(jtn jtnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ab16543", new Object[]{jtnVar})).booleanValue();
        }
        return jtnVar.j;
    }

    public static /* synthetic */ void b(jtn jtnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5225e5e", new Object[]{jtnVar});
        } else {
            jtnVar.k();
        }
    }

    public static /* synthetic */ void c(jtn jtnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf93577d", new Object[]{jtnVar});
        } else {
            jtnVar.B();
        }
    }

    public static /* synthetic */ void d(jtn jtnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea04509c", new Object[]{jtnVar});
        } else {
            jtnVar.F();
        }
    }

    public static /* synthetic */ void e(jtn jtnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47549bb", new Object[]{jtnVar});
        } else {
            jtnVar.C();
        }
    }

    public static /* synthetic */ void f(jtn jtnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ee642da", new Object[]{jtnVar});
        } else {
            jtnVar.t();
        }
    }

    public static /* synthetic */ RedPacketRainResponse.RedPacketInfo g(jtn jtnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RedPacketRainResponse.RedPacketInfo) ipChange.ipc$dispatch("3bf64308", new Object[]{jtnVar});
        }
        return jtnVar.l;
    }

    public static /* synthetic */ RedPacketRainResponse.RedPacketInfo h(jtn jtnVar, RedPacketRainResponse.RedPacketInfo redPacketInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RedPacketRainResponse.RedPacketInfo) ipChange.ipc$dispatch("70673fd7", new Object[]{jtnVar, redPacketInfo});
        }
        jtnVar.l = redPacketInfo;
        return redPacketInfo;
    }

    public static /* synthetic */ void i(jtn jtnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53c83518", new Object[]{jtnVar});
        } else {
            jtnVar.x();
        }
    }

    public static /* synthetic */ JSONObject j(jtn jtnVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5b7a7757", new Object[]{jtnVar, jSONObject});
        }
        jtnVar.m = jSONObject;
        return jSONObject;
    }

    public static void m(VideoInfo videoInfo, RedPacketRainResponse.RedPacketInfo redPacketInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c45e7d", new Object[]{videoInfo, redPacketInfo});
        } else if (o()) {
            new Handler().postDelayed(new c(videoInfo, redPacketInfo), y(3, 10));
        }
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70c6308e", new Object[0])).booleanValue();
        }
        return d4s.e("enableMiniPlayerRedPacketRain", true);
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1aa7c11", new Object[0])).booleanValue();
        }
        return d4s.e("enableMiniPlayerRedPacketRainTrack", true);
    }

    public static double r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bffd005f", new Object[0])).doubleValue();
        }
        return e.randomNumberGenerator.nextDouble();
    }

    public static boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b19a1c1", new Object[0])).booleanValue();
        }
        return q;
    }

    public static int y(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9b8be59d", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        return ((int) (r() * ((i2 - i) + 1))) + i;
    }

    public void A(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cc2da7f", new Object[]{this, videoInfo});
        } else {
            this.n = videoInfo;
        }
    }

    public final long D(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eaa49100", new Object[]{this, str})).longValue();
        }
        try {
            Date parse = this.p.parse(str);
            if (parse != null) {
                return parse.getTime();
            }
            return 0L;
        } catch (ParseException e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    public void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6315ff60", new Object[]{this});
            return;
        }
        o3s.a("MiniRainControl", "trackWidgetClick");
        if (this.k) {
            d dVar = this.o;
            if (dVar != null) {
                dVar.a(this.l, this.m);
            }
            m(this.n, this.l);
        }
    }

    public final void k() {
        AccountInfo accountInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86c96f77", new Object[]{this});
        } else if (u()) {
            o3s.b("MiniRainControl", "直播间是回放，不请求红包雨");
        } else {
            VideoInfo videoInfo = this.n;
            String str = "";
            String str2 = (videoInfo == null || (accountInfo = videoInfo.broadCaster) == null) ? str : accountInfo.accountId;
            if (videoInfo != null) {
                str = videoInfo.liveId;
            }
            new gtn(new b()).K(str2, str);
        }
    }

    public final long l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1b4d3178", new Object[]{this})).longValue();
        }
        o3s.a("MiniRainControl", "currentTimeStamp gap:" + (System.currentTimeMillis() - TimeStampManager.instance().getCurrentTimeStamp()));
        return TimeStampManager.instance().getCurrentTimeStamp();
    }

    public final void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15d888dd", new Object[]{this});
            return;
        }
        this.k = false;
        this.c.setVisibility(8);
    }

    public final boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("170800e8", new Object[]{this})).booleanValue();
        }
        if (v() || w()) {
            return true;
        }
        return false;
    }

    public final boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39087dbc", new Object[]{this})).booleanValue();
        }
        VideoInfo videoInfo = this.n;
        if (videoInfo != null) {
            return TextUtils.equals("2", videoInfo.roomStatus);
        }
        return false;
    }

    public final boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f73dab6", new Object[]{this})).booleanValue();
        }
        if (up6.d0(vx9.d()) == VideoStatus.VIDEO_TIMESHIFT_STATUS) {
            return true;
        }
        return false;
    }

    public final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1065913a", new Object[]{this});
            return;
        }
        o3s.a("MiniRainControl", "onRequestSuccess");
        if (u()) {
            o3s.b("MiniRainControl", "onRequestSuccess,直播间是回放，不继续执行");
            return;
        }
        RedPacketRainResponse.RedPacketInfo redPacketInfo = this.l;
        if (redPacketInfo == null) {
            o3s.a("MiniRainControl", "onRequestSuccess data=null");
        } else if (redPacketInfo.totalAmount < 100) {
            o3s.a("MiniRainControl", "一元以下红包雨不引导了");
        } else {
            long D = D(redPacketInfo.canDrawStartTime);
            long l = D - l();
            if (l < 0) {
                o3s.a("MiniRainControl", "红包雨已经开始");
            } else if (l > this.f) {
                o3s.a("MiniRainControl", "时间太长了，需要重新检查红包雨, 时差：" + l + "ms");
                this.b.sendEmptyMessageDelayed(1004, (D - l()) - this.f);
            } else {
                o3s.a("MiniRainControl", "红包雨在" + l + "ms后开始，开始设置延迟任务");
                this.b.sendEmptyMessageDelayed(1000, (D - l()) - this.g);
            }
        }
    }

    public void z(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e9adadf", new Object[]{this, dVar});
        } else {
            this.o = dVar;
        }
    }

    public final void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ec24244", new Object[]{this});
            return;
        }
        this.c.setVisibility(0);
        this.e.setText("正在瓜分");
        this.b.sendEmptyMessageDelayed(1003, this.h);
    }

    public final void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("268b03b", new Object[]{this});
            return;
        }
        TextView textView = this.e;
        textView.setText(this.i + "s后开抢");
        int i = this.i - 1;
        this.i = i;
        if (i <= 0) {
            o3s.a("MiniRainControl", "倒计时结束");
            this.b.sendEmptyMessageDelayed(1002, 1000L);
            return;
        }
        o3s.a("MiniRainControl", "倒计时减一秒");
        this.b.sendEmptyMessageDelayed(1001, 1000L);
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("337ba126", new Object[]{this});
        } else if (n()) {
            this.j = true;
            this.f = y(10, 15) * 1000;
            this.g = 5000L;
            this.h = 2000L;
            o3s.a("MiniRainControl", "进入小窗,needRecheckTime=" + this.f + ",countDownTime=" + this.g);
            this.c.setVisibility(8);
            TimeStampManager.instance().getCurrentTimeStamp();
            this.b.sendEmptyMessageDelayed(1004, 500L);
        }
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2c7e0ec", new Object[]{this});
            return;
        }
        o3s.a("MiniRainControl", "退出小窗");
        this.j = false;
        q = false;
        this.b.removeCallbacksAndMessages(null);
    }

    public final void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f9bdf87", new Object[]{this});
        } else if (u()) {
            o3s.b("MiniRainControl", "showUICountDown,直播间是回放，不继续执行");
        } else {
            d dVar = this.o;
            if (dVar != null) {
                dVar.onShow();
            }
            q = true;
            this.k = true;
            this.c.setVisibility(0);
            RedPacketRainResponse.RedPacketInfo redPacketInfo = this.l;
            if (redPacketInfo != null) {
                long j = redPacketInfo.totalAmount;
                if (j > 1000000) {
                    TextView textView = this.d;
                    textView.setText((j / 1000000) + "万");
                } else {
                    TextView textView2 = this.d;
                    textView2.setText((j / 100) + "元");
                }
            } else {
                this.d.setText("");
            }
            this.i = (int) (this.g / 1000);
            F();
        }
    }
}
