package com.taobao.social.sdk.net;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.p2o;
import tb.uog;
import tb.vog;
import tb.wu4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface ISocialService {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public enum SocialAction {
        QUERY_LIKE("doLike", 1),
        QUERY_REMOVE_LIKE("removeLike", 2),
        QUERY_COUNT_STATUS("count_status", 3),
        QUERY_REPORT("doReport", 4),
        QUERY_REPORT_NEW("doReport", 5);
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int intCode;
        private String name;

        SocialAction(String str, int i) {
            this.name = str;
            this.intCode = i;
        }

        public static /* synthetic */ Object ipc$super(SocialAction socialAction, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/social/sdk/net/ISocialService$SocialAction");
        }

        public static SocialAction valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SocialAction) ipChange.ipc$dispatch("c6cd9778", new Object[]{str});
            }
            return (SocialAction) Enum.valueOf(SocialAction.class, str);
        }

        public int getIntCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e24057c0", new Object[]{this})).intValue();
            }
            return this.intCode;
        }
    }

    int doLike(long j, long j2, String str, ISocialBusinessListener iSocialBusinessListener);

    int doLike(Map map, ISocialBusinessListener iSocialBusinessListener);

    int doLike(uog uogVar, ISocialBusinessListener iSocialBusinessListener);

    int doLike(vog vogVar, ISocialBusinessListener iSocialBusinessListener);

    int getCountAndStatus(Map map, ISocialBusinessListener iSocialBusinessListener);

    int getCountAndStatus(wu4 wu4Var, ISocialBusinessListener iSocialBusinessListener);

    int removeLike(long j, long j2, ISocialBusinessListener iSocialBusinessListener);

    int removeLike(String str, String str2, ISocialBusinessListener iSocialBusinessListener);

    int removeLike(Map map, ISocialBusinessListener iSocialBusinessListener);

    int report(long j, long j2, long j3, ISocialBusinessListener iSocialBusinessListener);

    int report(long j, long j2, ISocialBusinessListener iSocialBusinessListener);

    int report(Map map, ISocialBusinessListener iSocialBusinessListener);

    int report(p2o p2oVar, ISocialBusinessListener iSocialBusinessListener);
}
