import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.Set;
import java.util.Map;
import lombok.NonNull;
@Target(ElementType.TYPE_USE)
@interface MyAnnotation {
}
class SuperBuilderSingularAnnotatedTypes {
	private Set<@MyAnnotation @NonNull String> foos;
	private Map<@MyAnnotation @NonNull String, @MyAnnotation @NonNull Integer> bars;
	@java.lang.SuppressWarnings("all")
	public static abstract class SuperBuilderSingularAnnotatedTypesBuilder<C extends SuperBuilderSingularAnnotatedTypes, B extends SuperBuilderSingularAnnotatedTypesBuilder<C, B>> {
		@java.lang.SuppressWarnings("all")
		private java.util.ArrayList<@MyAnnotation @NonNull String> foos;
		@java.lang.SuppressWarnings("all")
		private java.util.ArrayList<@MyAnnotation @NonNull String> bars$key;
		@java.lang.SuppressWarnings("all")
		private java.util.ArrayList<@MyAnnotation @NonNull Integer> bars$value;
		@java.lang.SuppressWarnings("all")
		protected abstract B self();
		@java.lang.SuppressWarnings("all")
		public abstract C build();
		@java.lang.SuppressWarnings("all")
		public B foo(@MyAnnotation @NonNull final String foo) {
			if (foo == null) {
				throw new java.lang.NullPointerException("foo is marked @NonNull but is null");
			}
			if (this.foos == null) this.foos = new java.util.ArrayList<@MyAnnotation @NonNull String>();
			this.foos.add(foo);
			return self();
		}
		@java.lang.SuppressWarnings("all")
		public B foos(final java.util.Collection<? extends @MyAnnotation @NonNull String> foos) {
			if (this.foos == null) this.foos = new java.util.ArrayList<@MyAnnotation @NonNull String>();
			this.foos.addAll(foos);
			return self();
		}
		@java.lang.SuppressWarnings("all")
		public B clearFoos() {
			if (this.foos != null) this.foos.clear();
			return self();
		}
		@java.lang.SuppressWarnings("all")
		public B bar(@MyAnnotation @NonNull final String barKey, @MyAnnotation @NonNull final Integer barValue) {
			if (barKey == null) {
				throw new java.lang.NullPointerException("barKey is marked @NonNull but is null");
			}
			if (barValue == null) {
				throw new java.lang.NullPointerException("barValue is marked @NonNull but is null");
			}
			if (this.bars$key == null) {
				this.bars$key = new java.util.ArrayList<@MyAnnotation @NonNull String>();
				this.bars$value = new java.util.ArrayList<@MyAnnotation @NonNull Integer>();
			}
			this.bars$key.add(barKey);
			this.bars$value.add(barValue);
			return self();
		}
		@java.lang.SuppressWarnings("all")
		public B bars(final java.util.Map<? extends @MyAnnotation @NonNull String, ? extends @MyAnnotation @NonNull Integer> bars) {
			if (this.bars$key == null) {
				this.bars$key = new java.util.ArrayList<@MyAnnotation @NonNull String>();
				this.bars$value = new java.util.ArrayList<@MyAnnotation @NonNull Integer>();
			}
			for (final java.util.Map.Entry<? extends @MyAnnotation @NonNull String, ? extends @MyAnnotation @NonNull Integer> $lombokEntry : bars.entrySet()) {
				this.bars$key.add($lombokEntry.getKey());
				this.bars$value.add($lombokEntry.getValue());
			}
			return self();
		}
		@java.lang.SuppressWarnings("all")
		public B clearBars() {
			if (this.bars$key != null) {
				this.bars$key.clear();
				this.bars$value.clear();
			}
			return self();
		}
		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		public java.lang.String toString() {
			return "SuperBuilderSingularAnnotatedTypes.SuperBuilderSingularAnnotatedTypesBuilder(foos=" + this.foos + ", bars$key=" + this.bars$key + ", bars$value=" + this.bars$value + ")";
		}
	}
	@java.lang.SuppressWarnings("all")
	private static final class SuperBuilderSingularAnnotatedTypesBuilderImpl extends SuperBuilderSingularAnnotatedTypesBuilder<SuperBuilderSingularAnnotatedTypes, SuperBuilderSingularAnnotatedTypesBuilderImpl> {
		@java.lang.SuppressWarnings("all")
		private SuperBuilderSingularAnnotatedTypesBuilderImpl() {
		}
		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		protected SuperBuilderSingularAnnotatedTypesBuilderImpl self() {
			return this;
		}
		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		public SuperBuilderSingularAnnotatedTypes build() {
			return new SuperBuilderSingularAnnotatedTypes(this);
		}
	}
	@java.lang.SuppressWarnings("all")
	protected SuperBuilderSingularAnnotatedTypes(final SuperBuilderSingularAnnotatedTypesBuilder<?, ?> b) {
		java.util.Set<@MyAnnotation @NonNull String> foos;
		switch (b.foos == null ? 0 : b.foos.size()) {
		case 0: 
			foos = java.util.Collections.emptySet();
			break;
		case 1: 
			foos = java.util.Collections.singleton(b.foos.get(0));
			break;
		default: 
			foos = new java.util.LinkedHashSet<@MyAnnotation @NonNull String>(b.foos.size() < 1073741824 ? 1 + b.foos.size() + (b.foos.size() - 3) / 3 : java.lang.Integer.MAX_VALUE);
			foos.addAll(b.foos);
			foos = java.util.Collections.unmodifiableSet(foos);
		}
		this.foos = foos;
		java.util.Map<@MyAnnotation @NonNull String, @MyAnnotation @NonNull Integer> bars;
		switch (b.bars$key == null ? 0 : b.bars$key.size()) {
		case 0: 
			bars = java.util.Collections.emptyMap();
			break;
		case 1: 
			bars = java.util.Collections.singletonMap(b.bars$key.get(0), b.bars$value.get(0));
			break;
		default: 
			bars = new java.util.LinkedHashMap<@MyAnnotation @NonNull String, @MyAnnotation @NonNull Integer>(b.bars$key.size() < 1073741824 ? 1 + b.bars$key.size() + (b.bars$key.size() - 3) / 3 : java.lang.Integer.MAX_VALUE);
			for (int $i = 0; $i < b.bars$key.size(); $i++) bars.put(b.bars$key.get($i), (@MyAnnotation @NonNull Integer) b.bars$value.get($i));
			bars = java.util.Collections.unmodifiableMap(bars);
		}
		this.bars = bars;
	}
	@java.lang.SuppressWarnings("all")
	public static SuperBuilderSingularAnnotatedTypesBuilder<?, ?> builder() {
		return new SuperBuilderSingularAnnotatedTypesBuilderImpl();
	}
}