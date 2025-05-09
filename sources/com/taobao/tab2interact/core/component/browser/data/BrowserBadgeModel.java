package com.taobao.tab2interact.core.component.browser.data;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class BrowserBadgeModel {

    /* renamed from: a  reason: collision with root package name */
    public UserType f11795a;
    public UserStage b;
    public boolean c;
    public boolean d;
    public BrowserTaskModel e;
    public BrowserBadgeViewModel f;
    public a g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class BrowserBadgeViewModel {

        /* renamed from: a  reason: collision with root package name */
        public j f11796a;
        public h b;
        public c c;
        public g d;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public static class PicModel {

            /* renamed from: a  reason: collision with root package name */
            public Type f11797a;
            public String b;
            public String c;
            public String d;

            /* compiled from: Taobao */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
            public enum Type {
                PNG,
                APNG;
                
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(Type type, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/core/component/browser/data/BrowserBadgeModel$BrowserBadgeViewModel$PicModel$Type");
                }

                public static Type valueOf(String str) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (Type) ipChange.ipc$dispatch("9bc3ebe1", new Object[]{str});
                    }
                    return (Type) Enum.valueOf(Type.class, str);
                }
            }

            static {
                t2o.a(689963039);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public int f11798a;
            public int b;
            public long c;
            public String d;

            static {
                t2o.a(689963031);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public static class b extends l {
            public int e;

            static {
                t2o.a(689963032);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public static class c {

            /* renamed from: a  reason: collision with root package name */
            public i f11799a;
            public PicModel b;
            public PicModel c;
            public PicModel d;

            static {
                t2o.a(689963033);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public static class d {

            /* renamed from: a  reason: collision with root package name */
            public String f11800a;
            public long b;

            static {
                t2o.a(689963034);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public static class e {

            /* renamed from: a  reason: collision with root package name */
            public long f11801a;
            public String b;
            public TaskType c;

            static {
                t2o.a(689963035);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public static class f extends k {
            public String d;

            static {
                t2o.a(689963036);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public static class g {

            /* renamed from: a  reason: collision with root package name */
            public String f11802a;
            public String b;

            static {
                t2o.a(689963037);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public static class h {

            /* renamed from: a  reason: collision with root package name */
            public i f11803a;
            public i b;
            public i c;
            public f d;
            public PicModel e;
            public b f;
            public d g;
            public a h;

            static {
                t2o.a(689963038);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public static class i {

            /* renamed from: a  reason: collision with root package name */
            public String f11804a;
            public String b;

            static {
                t2o.a(689963041);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public static class j {

            /* renamed from: a  reason: collision with root package name */
            public i f11805a;
            public PicModel b;

            static {
                t2o.a(689963042);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public static class k extends e {
            static {
                t2o.a(689963043);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public static class l extends PicModel {
            static {
                t2o.a(689963044);
            }
        }

        static {
            t2o.a(689963030);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class BrowserTaskModel {

        /* renamed from: a  reason: collision with root package name */
        public long f11806a;
        public long b;
        public long c;
        public Map<ContentType, a> d;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public enum ContentType {
            VIDEO,
            LIVE,
            PICTURE_ALBUM,
            GG_GAME,
            COLLECTION,
            EXT;
            
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(ContentType contentType, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/core/component/browser/data/BrowserBadgeModel$BrowserTaskModel$ContentType");
            }

            public static ContentType valueOf(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (ContentType) ipChange.ipc$dispatch("f294dcc6", new Object[]{str});
                }
                return (ContentType) Enum.valueOf(ContentType.class, str);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public long f11807a;

            static {
                t2o.a(689963047);
            }
        }

        static {
            t2o.a(689963045);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public enum TaskType {
        DEFAULT,
        BROWSE_IN_TASK_PANEL;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(TaskType taskType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/core/component/browser/data/BrowserBadgeModel$TaskType");
        }

        public static TaskType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TaskType) ipChange.ipc$dispatch("337498d2", new Object[]{str});
            }
            return (TaskType) Enum.valueOf(TaskType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public enum UserStage {
        DEFAULT,
        SIMPLE_FOR_NEW_USER;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(UserStage userStage, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/core/component/browser/data/BrowserBadgeModel$UserStage");
        }

        public static UserStage valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (UserStage) ipChange.ipc$dispatch("5e30d852", new Object[]{str});
            }
            return (UserStage) Enum.valueOf(UserStage.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public enum UserType {
        DEFAULT,
        REWARD_ENHANCED;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(UserType userType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/core/component/browser/data/BrowserBadgeModel$UserType");
        }

        public static UserType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (UserType) ipChange.ipc$dispatch("3ce8de4c", new Object[]{str});
            }
            return (UserType) Enum.valueOf(UserType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f11808a;
        public String b;
        public C0666a c;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.tab2interact.core.component.browser.data.BrowserBadgeModel$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public static class C0666a {

            /* renamed from: a  reason: collision with root package name */
            public b f11809a;
            public b b;

            static {
                t2o.a(689963028);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public static class b {

            /* renamed from: a  reason: collision with root package name */
            public String f11810a;
            public String b;

            static {
                t2o.a(689963029);
            }
        }

        static {
            t2o.a(689963027);
        }
    }

    static {
        t2o.a(689963026);
    }
}
