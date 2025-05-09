package com.etao.feimagesearch.capture.scan;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface IDecodeTask {
    public static final a Companion = a.$$INSTANCE;
    public static final String TAG_PREFIX = "_scancode_";

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class TaskStatus extends Enum<TaskStatus> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final TaskStatus NORMAL = new TaskStatus("NORMAL", 0);
        public static final TaskStatus TIMEOUT = new TaskStatus("TIMEOUT", 1);
        public static final TaskStatus CANCELLED = new TaskStatus("CANCELLED", 2);
        private static final /* synthetic */ TaskStatus[] $VALUES = $values();

        private static final /* synthetic */ TaskStatus[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TaskStatus[]) ipChange.ipc$dispatch("53d6be08", new Object[0]) : new TaskStatus[]{NORMAL, TIMEOUT, CANCELLED};
        }

        private TaskStatus(String str, int i) {
        }

        public static /* synthetic */ Object ipc$super(TaskStatus taskStatus, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/scan/IDecodeTask$TaskStatus");
        }

        public static TaskStatus valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("ac3c07f3", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(TaskStatus.class, str);
            }
            return (TaskStatus) valueOf;
        }

        public static TaskStatus[] values() {
            Object clone;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                clone = ipChange.ipc$dispatch("61b188e4", new Object[0]);
            } else {
                clone = $VALUES.clone();
            }
            return (TaskStatus[]) clone;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static final /* synthetic */ a $$INSTANCE = new a();
        public static final String TAG_PREFIX = "_scancode_";

        static {
            t2o.a(481296698);
        }
    }
}
