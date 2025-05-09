package androidx.annotation;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.MustBeDocumented;
import kotlin.enums.a;
import tb.fg8;

/* compiled from: Taobao */
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PACKAGE})
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.CONSTRUCTOR, AnnotationTarget.FIELD, AnnotationTarget.FILE})
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
@MustBeDocumented
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\u0006B\u0014\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004R\u0017\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u0007"}, d2 = {"Landroidx/annotation/RestrictTo;", "", "value", "", "Landroidx/annotation/RestrictTo$Scope;", "()[Landroidx/annotation/RestrictTo$Scope;", "Scope", "annotation"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Documented
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public @interface RestrictTo {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Landroidx/annotation/RestrictTo$Scope;", "", "(Ljava/lang/String;I)V", "LIBRARY", "LIBRARY_GROUP", "LIBRARY_GROUP_PREFIX", "GROUP_ID", "TESTS", "SUBCLASSES", "annotation"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class Scope extends Enum<Scope> {
        private static final /* synthetic */ fg8 $ENTRIES;
        private static final /* synthetic */ Scope[] $VALUES;
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final Scope LIBRARY = new Scope("LIBRARY", 0);
        public static final Scope LIBRARY_GROUP = new Scope("LIBRARY_GROUP", 1);
        public static final Scope LIBRARY_GROUP_PREFIX = new Scope("LIBRARY_GROUP_PREFIX", 2);
        @Deprecated(message = "Use LIBRARY_GROUP_PREFIX instead.")
        public static final Scope GROUP_ID = new Scope("GROUP_ID", 3);
        public static final Scope TESTS = new Scope("TESTS", 4);
        public static final Scope SUBCLASSES = new Scope("SUBCLASSES", 5);

        static {
            Scope[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private Scope(String str, int i) {
        }

        public static fg8<Scope> getEntries() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
            }
            return $ENTRIES;
        }

        public static /* synthetic */ Object ipc$super(Scope scope, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/annotation/RestrictTo$Scope");
        }

        public static Scope valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("dffd9a8b", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(Scope.class, str);
            }
            return (Scope) valueOf;
        }

        public static Scope[] values() {
            Object clone;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                clone = ipChange.ipc$dispatch("7a2663c", new Object[0]);
            } else {
                clone = $VALUES.clone();
            }
            return (Scope[]) clone;
        }

        private static final /* synthetic */ Scope[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Scope[]) ipChange.ipc$dispatch("f6fc0e60", new Object[0]) : new Scope[]{LIBRARY, LIBRARY_GROUP, LIBRARY_GROUP_PREFIX, GROUP_ID, TESTS, SUBCLASSES};
        }
    }

    Scope[] value();
}
