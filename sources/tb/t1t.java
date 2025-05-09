package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.model.topGroup.ITaoLiveKtDxNoticeModel;
import com.taobao.live.liveroom.liveBizComponent.topGroup.model.TaoLiveKtNoticeEntity;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJSONUtils_androidKt;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;
import com.taobao.uniinfra_kmp.common_utils.serialization.a;
import java.util.LinkedHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class t1t {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final t1t INSTANCE = new t1t();

    static {
        t2o.a(1010827381);
    }

    public final boolean a(TaoLiveKtNoticeEntity taoLiveKtNoticeEntity, exs exsVar) {
        long j;
        String str;
        String str2;
        String str3;
        int i;
        int i2;
        int i3;
        ITaoLiveKtDxNoticeModel noticeModel;
        String string;
        Integer num;
        ITaoLiveKtDxNoticeModel noticeModel2;
        Long l;
        ITaoLiveKtDxNoticeModel noticeModel3;
        czs a2;
        ITaoLiveKtDxNoticeModel noticeModel4;
        Long enqueueTime$tao_live_crossplatform_foundation_release;
        ITaoLiveKtDxNoticeModel noticeModel5;
        String bizType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d112d63", new Object[]{this, taoLiveKtNoticeEntity, exsVar})).booleanValue();
        }
        if (taoLiveKtNoticeEntity != null && (noticeModel5 = taoLiveKtNoticeEntity.getNoticeModel()) != null && (bizType = noticeModel5.getBizType()) != null && bizType.length() == 0) {
            return false;
        }
        long a3 = ju6.a();
        long j2 = 0;
        if (taoLiveKtNoticeEntity == null || (enqueueTime$tao_live_crossplatform_foundation_release = taoLiveKtNoticeEntity.getEnqueueTime$tao_live_crossplatform_foundation_release()) == null) {
            j = 0;
        } else {
            j = enqueueTime$tao_live_crossplatform_foundation_release.longValue();
        }
        if (a3 - j > 60000) {
            return false;
        }
        KMPJsonObject kMPJsonObject = null;
        if (taoLiveKtNoticeEntity == null || (noticeModel4 = taoLiveKtNoticeEntity.getNoticeModel()) == null) {
            str = null;
        } else {
            str = noticeModel4.getSourceLiveId();
        }
        if (exsVar == null || (a2 = exsVar.a()) == null) {
            str2 = null;
        } else {
            str2 = a2.m();
        }
        if (ckf.b(str, str2)) {
            return true;
        }
        String str4 = "";
        if (taoLiveKtNoticeEntity == null || (noticeModel3 = taoLiveKtNoticeEntity.getNoticeModel()) == null || (str3 = noticeModel3.getBizType()) == null) {
            str3 = str4;
        }
        String str5 = mhr.Y().get(str3);
        if (str5 == null) {
            str5 = str4;
        }
        Object a4 = KMPJSONUtils_androidKt.a(a.Companion, str5);
        if (a4 instanceof KMPJsonObject) {
            kMPJsonObject = (KMPJsonObject) a4;
        }
        String b = azs.INSTANCE.b();
        if (b == null) {
            b = str4;
        }
        if (tvr.c(kMPJsonObject)) {
            b(str3, b, 1);
            return true;
        }
        if (!(kMPJsonObject == null || (l = kMPJsonObject.getLong("displayTime")) == null)) {
            j2 = l.longValue();
        }
        if (taoLiveKtNoticeEntity == null || (noticeModel2 = taoLiveKtNoticeEntity.getNoticeModel()) == null) {
            i = 0;
        } else {
            i = noticeModel2.getShowGap();
        }
        if (ju6.a() - j2 < i * 60000) {
            return false;
        }
        if (kMPJsonObject == null || (num = kMPJsonObject.getInt("count")) == null) {
            i2 = 0;
        } else {
            i2 = num.intValue();
        }
        if (!(kMPJsonObject == null || (string = kMPJsonObject.getString("date")) == null)) {
            str4 = string;
        }
        if (str4.length() > 0 && b.length() > 0 && ckf.b(str4, b)) {
            if (taoLiveKtNoticeEntity == null || (noticeModel = taoLiveKtNoticeEntity.getNoticeModel()) == null) {
                i3 = 0;
            } else {
                i3 = noticeModel.getShowCountPerDay();
            }
            if (i2 >= i3) {
                return false;
            }
            i2++;
        }
        b(str3, b, i2);
        return true;
    }

    public final void b(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c2e54c5", new Object[]{this, str, str2, new Integer(i)});
            return;
        }
        ckf.g(str, "key");
        ckf.g(str2, "curDate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("date", str2);
        linkedHashMap.put("count", Integer.valueOf(i));
        linkedHashMap.put("displayTime", Long.valueOf(ju6.a()));
        String c = l1t.INSTANCE.c(linkedHashMap);
        if (c == null) {
            c = "";
        }
        if (c.length() > 0) {
            mhr.Y().set(str, c);
        }
    }
}
