public interface IEntityRepository<T extends IEntity> //generic ise extends yazıyoruz implem. yerine
{
    void add(T entity);
    void delete(T entity);
    void update(T entity);
}
