package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.datamanager.model.RecModel;
import com.taobao.taolive.room.service.TppParamFeedInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class hjw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ijw f20695a;

    static {
        t2o.a(779092940);
    }

    public hjw(dba dbaVar) {
        this.f20695a = dbaVar.t0();
    }

    public ArrayList<TppParamFeedInfo> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("f5f53951", new Object[]{this});
        }
        return this.f20695a.c();
    }

    public ArrayList<TppParamFeedInfo> b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("c33f10c6", new Object[]{this, new Integer(i)});
        }
        return this.f20695a.d(i);
    }

    public void c(String str, long j, boolean z, long j2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("293ad2f6", new Object[]{this, str, new Long(j), new Boolean(z), new Long(j2), str2});
            return;
        }
        TppParamFeedInfo b = this.f20695a.b(str);
        if (b != null) {
            b.stay = j;
            b.followStatus = z ? 1 : 0;
            b.roomViewCnt = j2;
            b.fansLevel = str2;
        }
    }

    public void e(RecModel recModel, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84941ec0", new Object[]{this, recModel, new Boolean(z)});
        } else if (recModel != null && recModel.recommendCardInfo == null && recModel.reserveItemCardInfo == null) {
            TppParamFeedInfo tppParamFeedInfo = new TppParamFeedInfo();
            tppParamFeedInfo.liveId = recModel.liveId;
            tppParamFeedInfo.accountId = recModel.accountId;
            tppParamFeedInfo.clientReturnMap = recModel.clientReturnMap;
            tppParamFeedInfo.recommendBindId = recModel.recommendBindId;
            tppParamFeedInfo.timeMovingId = recModel.timeMovingId;
            tppParamFeedInfo.sjsdItemId = recModel.sjsdItemId;
            if (z) {
                tppParamFeedInfo.enter = System.currentTimeMillis();
            }
            this.f20695a.a(tppParamFeedInfo);
        }
    }

    public void d(String str, Object obj) {
        char c = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64484063", new Object[]{this, str, obj});
            return;
        }
        VideoInfo c0 = up6.c0(vx9.d());
        TppParamFeedInfo b = c0 != null ? this.f20695a.b(c0.liveId) : null;
        if (b != null) {
            try {
                switch (str.hashCode()) {
                    case -1832948174:
                        if (str.equals("com.taobao.taolive.room.add_item_new")) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1473773571:
                        if (str.equals(uyg.EVENT_ACTION_ADD_FAVOR)) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1450449455:
                        if (str.equals(uyg.EVENT_ADD_ITEM)) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1450012590:
                        if (str.equals(uyg.EVENT_SHOW_GOODSPACKAGE)) {
                            break;
                        }
                        c = 65535;
                        break;
                    case -833264487:
                        if (str.equals(uyg.EVENT_KMP_COMMENT_SEND)) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    case -830550742:
                        if (str.equals(uyg.EVENT_FOLLOW_FROM_FOLLOWFRAME)) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -554098287:
                        if (str.equals(uyg.EVENT_ACTION_FOLLOW)) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case -462319263:
                        if (str.equals("com.taobao.taolive.room.addcart")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 119727352:
                        if (str.equals("com.taobao.taolive.room.enter")) {
                            c = 11;
                            break;
                        }
                        c = 65535;
                        break;
                    case 132460031:
                        if (str.equals("com.taobao.taolive.room.share")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 458859892:
                        if (str.equals("com.taobao.taolive.room.gotoDetail")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1595703346:
                        if (str.equals(uyg.EVENT_INPUT_SHOW)) {
                            c = '\n';
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        if (obj instanceof Long) {
                            b.addCart.add((Long) obj);
                            return;
                        }
                        return;
                    case 1:
                        if (obj instanceof Long) {
                            b.gotoDetail.add((Long) obj);
                            return;
                        }
                        return;
                    case 2:
                        b.openGoodsList++;
                        return;
                    case 3:
                        Map d = sr4.d(obj, null);
                        if (d != null) {
                            try {
                                if (d.get("totalFavorCount") instanceof String) {
                                    b.like = Integer.parseInt((String) d.get("totalFavorCount"));
                                    return;
                                }
                                return;
                            } catch (Exception e) {
                                x5t.h("VisitedFeedInfoManager", "updateLastVisitedFeedInfoByEvent catchException = " + e.getMessage());
                                return;
                            }
                        } else {
                            return;
                        }
                    case 4:
                    case 5:
                        b.followStatus = 1;
                        return;
                    case 6:
                        b.share++;
                        return;
                    case 7:
                    case '\b':
                    case '\t':
                        b.comment++;
                        return;
                    case '\n':
                        b.openComment++;
                        return;
                    case 11:
                        b.enter = System.currentTimeMillis();
                        return;
                    default:
                        return;
                }
            } catch (Exception e2) {
                x5t.i("VisitedFeedInfoManager", "updateLastVisitedFeedInfoByEvent: " + str + " msg = " + e2.getMessage());
            }
        }
    }
}
