package tb;

import android.util.Log;
import anet.channel.status.NetworkStatusHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.data.global.a;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class rqj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "NdVideoSettingHelper: ";
    public static final boolean b = true;

    /* renamed from: a  reason: collision with root package name */
    public final a f27558a;

    static {
        t2o.a(352321644);
    }

    public rqj(a aVar) {
        this.f27558a = aVar;
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("388f8c83", new Object[]{this})).intValue();
        }
        try {
            dhb b2 = j9t.d(Globals.getApplication()).b();
            if (b2 == null) {
                txj.e("new_detail异常", "NdVideoSettingHelper: 配置异常，appSettingProvider is null");
                return -1;
            }
            Integer num = (Integer) b2.d("nd", "video", -1, null);
            if (num == null) {
                txj.e("new_detail异常", "NdVideoSettingHelper: 配置异常，appSettingResult is null.");
                return -1;
            }
            txj.e("new_detail异常", "NdVideoSettingHelper: 播放配置读取成功，appSettingResult:" + num);
            return num.intValue();
        } catch (Exception e) {
            txj.e("new_detail异常", "NdVideoSettingHelper: 读取我淘视频自动播放设置异常。" + Log.getStackTraceString(e));
            txj.e("new_detail异常", "NdVideoSettingHelper: 配置异常，默认值。defaultValue:-1");
            return -1;
        }
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ec3fd810", new Object[]{this})).intValue();
        }
        int h0 = this.f27558a.h0();
        if (h0 >= 0) {
            txj.e(txj.TAG_TIP, "NdVideoSettingHelper: 自动播放设置命中流内缓存。");
            return h0;
        }
        int a2 = a();
        this.f27558a.l1(a2);
        return a2;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ed5d283", new Object[]{this})).booleanValue();
        }
        int b2 = b();
        if (b2 < 0) {
            txj.e("new_detail异常", "NdVideoSettingHelper: 播放设置读取异常。videoAutoPlaySettingValue:" + b2);
            return b;
        } else if (b2 == 0) {
            NetworkStatusHelper.NetworkStatus status = NetworkStatusHelper.getStatus();
            if (status == null) {
                txj.e("new_detail异常", "NdVideoSettingHelper: 无法读取网络状态。");
                return b;
            } else if (status.isWifi()) {
                txj.e(txj.TAG_TIP, "NdVideoSettingHelper: Wifi状态下已开启自动播放。");
                return true;
            } else {
                txj.e(txj.TAG_TIP, "NdVideoSettingHelper: 非Wifi状态，不开启自动播放。");
                return false;
            }
        } else if (b2 == 1) {
            txj.e(txj.TAG_TIP, "NdVideoSettingHelper: 自动播放已全量开启。");
            return true;
        } else if (b2 != 2) {
            txj.e("new_detail异常", "NdVideoSettingHelper: 未知的播放设置。videoAutoPlaySettingValue:" + b2);
            return b;
        } else {
            txj.e(txj.TAG_TIP, "NdVideoSettingHelper: 自动播放已关闭。");
            return false;
        }
    }
}
