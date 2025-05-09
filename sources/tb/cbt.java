package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenLiveRoom;
import com.taobao.taolive.room.openarchitecture.gateway.command.type.TaoliveGatewayEnum;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class cbt extends bbt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final rat c = new rat();
    public final wat b = new wat();
    public final vat d = new vat();
    public final uat e = new uat();
    public final tat f = new tat();
    public final yat g = new yat();
    public final xat h = new xat();

    static {
        t2o.a(779093028);
    }

    public static /* synthetic */ Object ipc$super(cbt cbtVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/openarchitecture/gateway/handler/impl/TaoliveGatewayCommandHandler");
    }

    @Override // tb.bbt
    public Object c(TaoliveGatewayEnum taoliveGatewayEnum, jbt jbtVar, Object... objArr) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ba6be387", new Object[]{this, taoliveGatewayEnum, jbtVar, objArr});
        }
        if (taoliveGatewayEnum == TaoliveGatewayEnum.TaoliveGateway_Create_OpenLiveRoom) {
            return this.b.a(jbtVar, new Object[0]);
        }
        if (taoliveGatewayEnum == TaoliveGatewayEnum.TaoliveGateway_Create_OpenLiveCompontent) {
            return this.d.a(jbtVar, objArr);
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = null;
        if (taoliveGatewayEnum == TaoliveGatewayEnum.TaoliveGateway_Create_OpenLiveRoomView) {
            if (objArr != null && objArr.length > 0) {
                Object obj2 = objArr[0];
                if (obj2 instanceof TaoliveOpenLiveRoom) {
                    taoliveOpenLiveRoom = (TaoliveOpenLiveRoom) obj2;
                }
            }
            return this.c.a(jbtVar, taoliveOpenLiveRoom);
        } else if (taoliveGatewayEnum == TaoliveGatewayEnum.TaoliveGateway_Create_OpenH5PlatformView) {
            if (objArr != null && objArr.length > 0) {
                Object obj3 = objArr[0];
                if (obj3 instanceof TaoliveOpenLiveRoom) {
                    TaoliveOpenLiveRoom taoliveOpenLiveRoom2 = (TaoliveOpenLiveRoom) obj3;
                    if (objArr.length > 1) {
                        taoliveOpenLiveRoom = objArr[1];
                    }
                    taoliveOpenLiveRoom = taoliveOpenLiveRoom2;
                    obj = taoliveOpenLiveRoom;
                    return this.e.a(jbtVar, taoliveOpenLiveRoom, obj);
                }
            }
            obj = null;
            return this.e.a(jbtVar, taoliveOpenLiveRoom, obj);
        } else if (taoliveGatewayEnum == TaoliveGatewayEnum.TaoliveGateway_Create_OpenH5Compontent) {
            return this.f.a(jbtVar, objArr);
        } else {
            if (taoliveGatewayEnum == TaoliveGatewayEnum.TaoliveGateway_Create_OpenWatchContainer) {
                return this.g.a(jbtVar, objArr);
            }
            if (taoliveGatewayEnum == TaoliveGatewayEnum.TaoliveGateway_Create_OpenWatchCompontent) {
                return this.h.b(jbtVar, objArr);
            }
            return null;
        }
    }

    public zyd i(jbt jbtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zyd) ipChange.ipc$dispatch("e062c57c", new Object[]{this, jbtVar});
        }
        return this;
    }
}
