package androidx.annotation;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.enums.a;
import tb.fg8;

/* compiled from: Taobao */
@Target({ElementType.METHOD})
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0003\u0015\u0016\u0017BH\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bR\u000f\u0010\u0004\u001a\u00020\u0005¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u000fR\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0006\u001a\u0004\b\n\u0010\u0010R\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b¢\u0006\u0006\u001a\u0004\b\r\u0010\u0011R\u000f\u0010\u0006\u001a\u00020\u0007¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0012R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0013R\u000f\u0010\b\u001a\u00020\t¢\u0006\u0006\u001a\u0004\b\b\u0010\u0014¨\u0006\u0018"}, d2 = {"Landroidx/annotation/InspectableProperty;", "", "name", "", "attributeId", "", "hasAttributeId", "", "valueType", "Landroidx/annotation/InspectableProperty$ValueType;", "enumMapping", "", "Landroidx/annotation/InspectableProperty$EnumEntry;", "flagMapping", "Landroidx/annotation/InspectableProperty$FlagEntry;", "()I", "()[Landroidx/annotation/InspectableProperty$EnumEntry;", "()[Landroidx/annotation/InspectableProperty$FlagEntry;", "()Z", "()Ljava/lang/String;", "()Landroidx/annotation/InspectableProperty$ValueType;", "EnumEntry", "FlagEntry", "ValueType", "annotation"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated(message = "Replaced by the androidx.resourceinpsection package.")
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER})
@Retention(RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public @interface InspectableProperty {

    /* compiled from: Taobao */
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0006R\u000f\u0010\u0004\u001a\u00020\u0005¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/annotation/InspectableProperty$EnumEntry;", "", "name", "", "value", "", "()Ljava/lang/String;", "()I", "annotation"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public @interface EnumEntry {
        String name();

        int value();
    }

    /* compiled from: Taobao */
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0002\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005R\u000f\u0010\u0006\u001a\u00020\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\bR\u000f\u0010\u0004\u001a\u00020\u0005¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/annotation/InspectableProperty$FlagEntry;", "", "name", "", "target", "", "mask", "()I", "()Ljava/lang/String;", "annotation"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public @interface FlagEntry {
        int mask() default 0;

        String name();

        int target();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Landroidx/annotation/InspectableProperty$ValueType;", "", "(Ljava/lang/String;I)V", "NONE", "INFERRED", "INT_ENUM", "INT_FLAG", "COLOR", "GRAVITY", "RESOURCE_ID", "annotation"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class ValueType extends Enum<ValueType> {
        private static final /* synthetic */ fg8 $ENTRIES;
        private static final /* synthetic */ ValueType[] $VALUES;
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final ValueType NONE = new ValueType("NONE", 0);
        public static final ValueType INFERRED = new ValueType("INFERRED", 1);
        public static final ValueType INT_ENUM = new ValueType("INT_ENUM", 2);
        public static final ValueType INT_FLAG = new ValueType("INT_FLAG", 3);
        public static final ValueType COLOR = new ValueType("COLOR", 4);
        public static final ValueType GRAVITY = new ValueType("GRAVITY", 5);
        public static final ValueType RESOURCE_ID = new ValueType("RESOURCE_ID", 6);

        static {
            ValueType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private ValueType(String str, int i) {
        }

        public static fg8<ValueType> getEntries() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
            }
            return $ENTRIES;
        }

        public static /* synthetic */ Object ipc$super(ValueType valueType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/annotation/InspectableProperty$ValueType");
        }

        public static ValueType valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("a1e6519a", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(ValueType.class, str);
            }
            return (ValueType) valueOf;
        }

        public static ValueType[] values() {
            Object clone;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                clone = ipChange.ipc$dispatch("dfbcd89", new Object[0]);
            } else {
                clone = $VALUES.clone();
            }
            return (ValueType[]) clone;
        }

        private static final /* synthetic */ ValueType[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ValueType[]) ipChange.ipc$dispatch("e6c37fe5", new Object[0]) : new ValueType[]{NONE, INFERRED, INT_ENUM, INT_FLAG, COLOR, GRAVITY, RESOURCE_ID};
        }
    }

    int attributeId() default 0;

    EnumEntry[] enumMapping() default {};

    FlagEntry[] flagMapping() default {};

    boolean hasAttributeId() default true;

    String name() default "";

    ValueType valueType() default ValueType.INFERRED;
}
