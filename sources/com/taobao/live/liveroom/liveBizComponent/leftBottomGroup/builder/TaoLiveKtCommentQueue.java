package com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.builder;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentEntity;
import com.taobao.kmp.live.liveBizComponent.service.biz.comment.ITaoLiveKtCommentQueue;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.weex.common.Constants;
import java.util.Map;
import kotlin.Metadata;
import tb.czs;
import tb.d04;
import tb.ob1;
import tb.t2o;
import tb.tvr;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\u00072\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u0005R2\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0018\u00010\u001d8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\"\u0010)\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0018\"\u0004\b,\u0010-R$\u0010/\u001a\u0004\u0018\u00010.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u00065"}, d2 = {"Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/builder/TaoLiveKtCommentQueue;", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/comment/ITaoLiveKtCommentQueue;", "", Constants.Name.MAX_LENGTH, "<init>", "(I)V", "len", "Ltb/xhv;", "checkedOverLength", "Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/comment/TaoLiveKtCommentEntity;", "model", "writeComment", "(Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/comment/TaoLiveKtCommentEntity;)V", "", "models", "writeComments", "([Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/comment/TaoLiveKtCommentEntity;)V", "readComment", "()Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/comment/TaoLiveKtCommentEntity;", "clearComment$tao_live_crossplatform_foundation_release", "()V", "clearComment", "", "isEmpty", "()Z", TLogTracker.LEVEL_INFO, "getMaxLength", "()I", "setMaxLength", "", "", "", "originData", "Ljava/util/Map;", "getOriginData", "()Ljava/util/Map;", "setOriginData", "(Ljava/util/Map;)V", "Ltb/ob1;", "arrayDeque", "Ltb/ob1;", "disableCommentButton", "Z", "getDisableCommentButton", "setDisableCommentButton", "(Z)V", "Ltb/czs;", "detailModel", "Ltb/czs;", "getDetailModel", "()Ltb/czs;", "setDetailModel", "(Ltb/czs;)V", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtCommentQueue implements ITaoLiveKtCommentQueue {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ob1<TaoLiveKtCommentEntity> arrayDeque = new ob1<>();
    private czs detailModel;
    private boolean disableCommentButton;
    private int maxLength;
    private Map<String, ? extends Object> originData;

    static {
        t2o.a(1010827312);
        t2o.a(1003487346);
    }

    public TaoLiveKtCommentQueue(int i) {
        this.maxLength = i;
    }

    private final void checkedOverLength(int i) {
        int i2;
        ob1<TaoLiveKtCommentEntity> ob1Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4894c81b", new Object[]{this, new Integer(i)});
            return;
        }
        ob1<TaoLiveKtCommentEntity> ob1Var2 = this.arrayDeque;
        if (ob1Var2 != null) {
            i2 = ob1Var2.size();
        } else {
            i2 = 0;
        }
        int i3 = i2 + i;
        int i4 = this.maxLength;
        if (i3 > i4) {
            int i5 = (i3 - i4) - 1;
            for (int i6 = 0; i6 < i5; i6++) {
                ob1<TaoLiveKtCommentEntity> ob1Var3 = this.arrayDeque;
                if (!(ob1Var3 == null || !(!ob1Var3.isEmpty()) || (ob1Var = this.arrayDeque) == null)) {
                    ob1Var.removeFirst();
                }
            }
        }
    }

    public final void clearComment$tao_live_crossplatform_foundation_release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96ebb9d2", new Object[]{this});
            return;
        }
        ob1<TaoLiveKtCommentEntity> ob1Var = this.arrayDeque;
        if (ob1Var != null) {
            ob1Var.clear();
        }
        this.arrayDeque = null;
    }

    public final czs getDetailModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (czs) ipChange.ipc$dispatch("d902976d", new Object[]{this});
        }
        return this.detailModel;
    }

    public final boolean getDisableCommentButton() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c13dea", new Object[]{this})).booleanValue();
        }
        return this.disableCommentButton;
    }

    public final int getMaxLength() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc9ead2e", new Object[]{this})).intValue();
        }
        return this.maxLength;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.base.ITaoLiveKtOutViewModel
    public Map<String, Object> getOriginData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("830078e2", new Object[]{this});
        }
        return this.originData;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.comment.ITaoLiveKtCommentQueue
    public boolean isEmpty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
        }
        ob1<TaoLiveKtCommentEntity> ob1Var = this.arrayDeque;
        if (ob1Var != null) {
            return ob1Var.isEmpty();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a6  */
    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.comment.ITaoLiveKtCommentQueue
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentEntity readComment() {
        /*
            r11 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.builder.TaoLiveKtCommentQueue.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "15c40d4d"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r11
            java.lang.Object r0 = r0.ipc$dispatch(r1, r2)
            com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentEntity r0 = (com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentEntity) r0
            return r0
        L_0x0015:
            tb.ob1<com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentEntity> r0 = r11.arrayDeque
            r1 = 0
            if (r0 == 0) goto L_0x0021
            java.lang.Object r0 = r0.k()
            com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentEntity r0 = (com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentEntity) r0
            goto L_0x0022
        L_0x0021:
            r0 = r1
        L_0x0022:
            if (r0 == 0) goto L_0x0029
            boolean r2 = r11.disableCommentButton
            r0.setDisableCommentButton(r2)
        L_0x0029:
            if (r0 == 0) goto L_0x0030
            tb.czs r2 = r11.detailModel
            r0.setDetailModel(r2)
        L_0x0030:
            java.lang.String r2 = ", data === "
            java.lang.String r3 = ""
            if (r0 == 0) goto L_0x00a4
            tb.l1t r4 = tb.l1t.INSTANCE
            java.util.List r5 = r0.getOriginBadgeInfos()
            if (r5 != 0) goto L_0x0040
            r6 = r1
            goto L_0x00a1
        L_0x0040:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: Exception -> 0x006f
            r6.<init>()     // Catch: Exception -> 0x006f
            java.util.Iterator r7 = r5.iterator()     // Catch: Exception -> 0x006d
        L_0x0049:
            boolean r8 = r7.hasNext()     // Catch: Exception -> 0x006d
            if (r8 == 0) goto L_0x00a1
            java.lang.Object r8 = r7.next()     // Catch: Exception -> 0x006d
            com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject r9 = new com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject     // Catch: Exception -> 0x006d
            if (r8 != 0) goto L_0x0058
            r8 = r1
        L_0x0058:
            r9.<init>(r8)     // Catch: Exception -> 0x006d
            com.taobao.uniinfra_kmp.common_utils.serialization.a$a r8 = com.taobao.uniinfra_kmp.common_utils.serialization.a.Companion     // Catch: Exception -> 0x006d
            java.lang.Class<com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentBadgeModel> r10 = com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentBadgeModel.class
            tb.wyf r10 = tb.dun.b(r10)     // Catch: Exception -> 0x006d
            java.io.Serializable r8 = com.taobao.uniinfra_kmp.common_utils.serialization.KMPJSONUtils_androidKt.decodeFromJsonObject(r8, r9, r10)     // Catch: Exception -> 0x006d
            if (r8 == 0) goto L_0x0049
            r6.add(r8)     // Catch: Exception -> 0x006d
            goto L_0x0049
        L_0x006d:
            r7 = move-exception
            goto L_0x0071
        L_0x006f:
            r7 = move-exception
            r6 = r1
        L_0x0071:
            tb.pus r8 = tb.pus.INSTANCE
            java.lang.Class r4 = r4.getClass()
            tb.wyf r4 = tb.dun.b(r4)
            tb.ns3 r4 = (tb.ns3) r4
            java.lang.String r4 = r4.getSimpleName()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "listModelFromList === "
            r9.<init>(r10)
            java.lang.String r7 = r7.getMessage()
            r9.append(r7)
            r9.append(r2)
            r9.append(r5)
            java.lang.String r5 = r9.toString()
            r8.f(r4, r3, r5)
        L_0x00a1:
            r0.setBadgeInfos(r6)
        L_0x00a4:
            if (r0 == 0) goto L_0x00f7
            tb.l1t r4 = tb.l1t.INSTANCE
            java.util.Map r5 = r0.getOriginBgStyle()
            if (r5 != 0) goto L_0x00af
            goto L_0x00f2
        L_0x00af:
            com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject r6 = new com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject     // Catch: Exception -> 0x00c1
            r6.<init>(r5)     // Catch: Exception -> 0x00c1
            com.taobao.uniinfra_kmp.common_utils.serialization.a$a r7 = com.taobao.uniinfra_kmp.common_utils.serialization.a.Companion     // Catch: Exception -> 0x00c1
            java.lang.Class<com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentBgStyle> r8 = com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentBgStyle.class
            tb.wyf r8 = tb.dun.b(r8)     // Catch: Exception -> 0x00c1
            java.io.Serializable r1 = com.taobao.uniinfra_kmp.common_utils.serialization.KMPJSONUtils_androidKt.decodeFromJsonObject(r7, r6, r8)     // Catch: Exception -> 0x00c1
            goto L_0x00f2
        L_0x00c1:
            r6 = move-exception
            tb.pus r7 = tb.pus.INSTANCE
            java.lang.Class r4 = r4.getClass()
            tb.wyf r4 = tb.dun.b(r4)
            tb.ns3 r4 = (tb.ns3) r4
            java.lang.String r4 = r4.getSimpleName()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "modelFromMap === "
            r8.<init>(r9)
            java.lang.String r6 = r6.getMessage()
            r8.append(r6)
            r8.append(r2)
            r8.append(r5)
            java.lang.String r2 = r8.toString()
            r7.f(r4, r3, r2)
        L_0x00f2:
            com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentBgStyle r1 = (com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentBgStyle) r1
            r0.setBgStyle(r1)
        L_0x00f7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.builder.TaoLiveKtCommentQueue.readComment():com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentEntity");
    }

    public final void setDetailModel(czs czsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc2277fd", new Object[]{this, czsVar});
        } else {
            this.detailModel = czsVar;
        }
    }

    public final void setDisableCommentButton(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd338a22", new Object[]{this, new Boolean(z)});
        } else {
            this.disableCommentButton = z;
        }
    }

    public final void setMaxLength(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f2dd534", new Object[]{this, new Integer(i)});
        } else {
            this.maxLength = i;
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.base.ITaoLiveKtOutViewModel
    public void setOriginData(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("371348ec", new Object[]{this, map});
        } else {
            this.originData = map;
        }
    }

    public final void writeComment(TaoLiveKtCommentEntity taoLiveKtCommentEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc8a7d6e", new Object[]{this, taoLiveKtCommentEntity});
        } else if (taoLiveKtCommentEntity != null) {
            writeComments(new TaoLiveKtCommentEntity[]{taoLiveKtCommentEntity});
        }
    }

    public final void writeComments(TaoLiveKtCommentEntity[] taoLiveKtCommentEntityArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dedd3442", new Object[]{this, taoLiveKtCommentEntityArr});
        } else if (taoLiveKtCommentEntityArr != null && !tvr.c(taoLiveKtCommentEntityArr)) {
            checkedOverLength(taoLiveKtCommentEntityArr.length);
            ob1<TaoLiveKtCommentEntity> ob1Var = this.arrayDeque;
            if (ob1Var != null) {
                d04.w(ob1Var, taoLiveKtCommentEntityArr);
            }
        }
    }
}
