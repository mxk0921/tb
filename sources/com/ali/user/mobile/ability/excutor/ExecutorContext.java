package com.ali.user.mobile.ability.excutor;

import android.content.Context;
import com.ali.user.mobile.base.BaseView;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ExecutorContext {
    public Map<String, String> componentFields;
    public Context context;
    public BaseView mView;
    public Map<String, String> pageFields;
    public ExecutorParams params;
    public String trace;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class ExcutorContextBuilder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private BaseView baseView;
        private Context context;
        private ExecutorParams params;
        private String trace;
        private Map<String, String> pageFields = new HashMap();
        private Map<String, String> componentFields = new HashMap();

        static {
            t2o.a(69206029);
        }

        public static /* synthetic */ Context access$000(ExcutorContextBuilder excutorContextBuilder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Context) ipChange.ipc$dispatch("1e29b316", new Object[]{excutorContextBuilder});
            }
            return excutorContextBuilder.context;
        }

        public static /* synthetic */ BaseView access$100(ExcutorContextBuilder excutorContextBuilder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BaseView) ipChange.ipc$dispatch("eca5aaa2", new Object[]{excutorContextBuilder});
            }
            return excutorContextBuilder.baseView;
        }

        public static /* synthetic */ Map access$200(ExcutorContextBuilder excutorContextBuilder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("2749e391", new Object[]{excutorContextBuilder});
            }
            return excutorContextBuilder.pageFields;
        }

        public static /* synthetic */ Map access$300(ExcutorContextBuilder excutorContextBuilder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("7cbab70", new Object[]{excutorContextBuilder});
            }
            return excutorContextBuilder.componentFields;
        }

        public static /* synthetic */ ExecutorParams access$400(ExcutorContextBuilder excutorContextBuilder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ExecutorParams) ipChange.ipc$dispatch("f7c19528", new Object[]{excutorContextBuilder});
            }
            return excutorContextBuilder.params;
        }

        public static /* synthetic */ String access$500(ExcutorContextBuilder excutorContextBuilder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("579cfd07", new Object[]{excutorContextBuilder});
            }
            return excutorContextBuilder.trace;
        }

        public ExcutorContextBuilder baseView(BaseView baseView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ExcutorContextBuilder) ipChange.ipc$dispatch("8d105cdd", new Object[]{this, baseView});
            }
            this.baseView = baseView;
            return this;
        }

        public ExecutorContext build() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ExecutorContext) ipChange.ipc$dispatch("94e6def4", new Object[]{this});
            }
            return new ExecutorContext(this);
        }

        public ExcutorContextBuilder context(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ExcutorContextBuilder) ipChange.ipc$dispatch("2cdb3a77", new Object[]{this, context});
            }
            this.context = context;
            return this;
        }

        public ExcutorContextBuilder params(ExecutorParams executorParams) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ExcutorContextBuilder) ipChange.ipc$dispatch("e1e78dde", new Object[]{this, executorParams});
            }
            this.params = executorParams;
            return this;
        }

        public ExcutorContextBuilder trace(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ExcutorContextBuilder) ipChange.ipc$dispatch("3f62b5bb", new Object[]{this, str});
            }
            this.trace = str;
            return this;
        }
    }

    static {
        t2o.a(69206027);
    }

    private ExecutorContext(ExcutorContextBuilder excutorContextBuilder) {
        this.pageFields = new HashMap();
        this.componentFields = new HashMap();
        this.context = ExcutorContextBuilder.access$000(excutorContextBuilder);
        this.mView = ExcutorContextBuilder.access$100(excutorContextBuilder);
        this.pageFields = ExcutorContextBuilder.access$200(excutorContextBuilder);
        this.componentFields = ExcutorContextBuilder.access$300(excutorContextBuilder);
        this.params = ExcutorContextBuilder.access$400(excutorContextBuilder);
        this.trace = ExcutorContextBuilder.access$500(excutorContextBuilder);
    }
}
