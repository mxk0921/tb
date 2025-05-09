package tb;

import android.app.Activity;
import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.miniLive.ui.TBLiveVideoView;
import com.taobao.taolive.sdk.model.common.QualitySelectItem;
import com.taobao.taolive.sdk.model.common.TBTVProgramInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.message.LiveSystemMessage;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import java.util.ArrayList;
import tb.bpr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class lkr implements bpr.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String f = lkr.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public final TBLiveVideoView f23386a;
    public VideoInfo b;
    public boolean d;
    public int c = 0;
    public String e = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends MessageTypeFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(lkr lkrVar) {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/miniLive/sdk/TBLiveH265Handler$1");
        }

        @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
        public boolean filter(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue();
            }
            if (i == 1024 || i == 1026 || i == 1017) {
                return true;
            }
            return false;
        }
    }

    static {
        t2o.a(779092015);
        t2o.a(779092002);
    }

    public lkr(TBLiveVideoView tBLiveVideoView, Activity activity, boolean z) {
        this.f23386a = tBLiveVideoView;
        nmr.e().i(this, new a(this));
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6965e5b8", new Object[0])).booleanValue();
        }
        String b = v2s.o().p().b("tblive", "ARTPDeviceBlackist", "");
        if (TextUtils.isEmpty(b)) {
            return false;
        }
        String str = Build.MODEL;
        String[] split = b.split(";");
        if (split != null && split.length > 0 && !TextUtils.isEmpty(str)) {
            for (String str2 : split) {
                if (!TextUtils.isEmpty(str2) && str.equalsIgnoreCase(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int g(ArrayList<QualitySelectItem> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a7997dea", new Object[]{arrayList})).intValue();
        }
        if (arrayList == null || arrayList.size() <= 0) {
            return -1;
        }
        if (arrayList.size() == 1) {
            return 0;
        }
        if (arrayList.size() >= 2) {
            return 1;
        }
        return -1;
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3efee4c2", new Object[]{this, str});
            return;
        }
        String e = e(str);
        if (!TextUtils.isEmpty(e)) {
            this.f23386a.playStreamUrl(e, false, l(), zqq.j(str), true);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            nmr.e().n(this);
        }
    }

    public final String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8cb737b", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int j = zqq.j(str);
        ArrayList<QualitySelectItem> h = h(this.b);
        if (h == null || j < 0 || j >= h.size()) {
            return null;
        }
        this.c = j;
        String i = i(this.b, j);
        this.f23386a.setVideoDefinition(j(this.b, this.c));
        return i;
    }

    public int f(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("778410cd", new Object[]{this, videoInfo})).intValue();
        }
        if (videoInfo != null) {
            return g(h(videoInfo));
        }
        return -1;
    }

    public final ArrayList<QualitySelectItem> h(VideoInfo videoInfo) {
        TBTVProgramInfo tBTVProgramInfo;
        ArrayList<QualitySelectItem> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("de42d2f5", new Object[]{this, videoInfo});
        }
        if (!l() || (tBTVProgramInfo = videoInfo.tbtvLiveDO) == null || (arrayList = tBTVProgramInfo.liveUrlList) == null) {
            return videoInfo.liveUrlList;
        }
        return arrayList;
    }

    public String i(VideoInfo videoInfo, int i) {
        ArrayList<QualitySelectItem> arrayList;
        ArrayList<QualitySelectItem> h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("703ace96", new Object[]{this, videoInfo, new Integer(i)});
        }
        if (videoInfo == null || (arrayList = videoInfo.liveUrlList) == null || arrayList.size() == 0) {
            return null;
        }
        this.b = videoInfo;
        this.c = i;
        if (i < 0 || (h = h(videoInfo)) == null) {
            return videoInfo.liveUrl;
        }
        if (this.e != null || !b() || h.get(i).artpUrl == null) {
            return h.get(i).flvUrl;
        }
        String str = h.get(i).artpUrl;
        this.e = str;
        return str;
    }

    public String j(VideoInfo videoInfo, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb8496eb", new Object[]{this, videoInfo, new Integer(i)});
        }
        ArrayList<QualitySelectItem> h = h(videoInfo);
        if (h == null || i < 0 || i >= h.size()) {
            return null;
        }
        return h.get(i).name;
    }

    public final boolean k(LiveSystemMessage liveSystemMessage) {
        int intValue;
        int intValue2;
        int intValue3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f83d33f", new Object[]{this, liveSystemMessage})).booleanValue();
        }
        if (liveSystemMessage == null || TextUtils.isEmpty(liveSystemMessage.low) || TextUtils.isEmpty(liveSystemMessage.high) || !TextUtils.isDigitsOnly(liveSystemMessage.low) || !TextUtils.isDigitsOnly(liveSystemMessage.high) || v2s.o().u() == null) {
            return false;
        }
        String userId = v2s.o().u().getUserId();
        if (TextUtils.isEmpty(userId)) {
            return false;
        }
        try {
            intValue = Integer.valueOf(liveSystemMessage.low).intValue();
            intValue2 = Integer.valueOf(liveSystemMessage.high).intValue();
            if (userId.length() >= 2) {
                userId = userId.substring(userId.length() - 2, userId.length());
            }
            intValue3 = Integer.valueOf(userId).intValue();
        } catch (Exception unused) {
        }
        if (intValue > intValue3 || intValue3 > intValue2) {
            return false;
        }
        return true;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a43c125", new Object[]{this})).booleanValue();
        }
        VideoInfo videoInfo = this.b;
        if (videoInfo == null || videoInfo.roomType != 13) {
            return false;
        }
        return true;
    }

    public void m(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceeadb9a", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public int n(VideoInfo videoInfo, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("73938b42", new Object[]{this, videoInfo, new Boolean(z)})).intValue();
        }
        if (videoInfo != null) {
            return f(videoInfo);
        }
        return -1;
    }

    @Override // tb.bpr.c
    public void onMessageReceived(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
            return;
        }
        cwd A = v2s.o().A();
        String str = f;
        A.a(str, "onMessageReceived----- msgType = " + i);
        if (obj != null) {
            if (i == 1024) {
                if ("useH264".equals(((LiveSystemMessage) obj).type)) {
                    v2s.o().A().a(str, "useH264");
                    if (!this.d) {
                        this.e = "DEFAULT";
                        String i2 = i(this.b, this.c);
                        this.e = null;
                        this.f23386a.playStreamUrl(i2, false, l(), -1, false);
                    }
                }
            } else if (i != 1026 && i == 1017) {
                LiveSystemMessage liveSystemMessage = (LiveSystemMessage) obj;
                if (!this.d && this.e == null && this.f23386a != null && k(liveSystemMessage)) {
                    a(liveSystemMessage.playerQuality);
                }
            }
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a7cf99a", new Object[]{this})).booleanValue();
        }
        boolean c = zqq.c(v2s.o().p().b("tblive", "TBLIVE_ORANGE_ARTP_Enable_NewV2", "false"));
        if (!c || !c()) {
            return c;
        }
        return false;
    }
}
